package com.knot.Banking.ServiceImpl;

import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Date;
import java.util.function.Function;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.knot.Banking.Dao.LoginDao;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Service
public class JWTService {
	
	@Autowired
	private LoginDao loginDao;
	
	
	private String secretKey="";
	
	public JWTService() {
		try {
			KeyGenerator keyGen=KeyGenerator.getInstance("HmacSHA256");
			SecretKey sk= keyGen.generateKey();
			secretKey =Base64.getEncoder().encodeToString(sk.getEncoded());
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}

	private SecretKey getKey() {
		
		byte [] keyBytes= Decoders.BASE64.decode(secretKey);
		return Keys.hmacShaKeyFor(keyBytes);
	}


	public String extractUsername(String token) {
		
		return extractClaim(token,Claims::getSubject);
	}


	private <T> T extractClaim(String token, Function<Claims, T> claimResolver) {
		final Claims claims=extractAllClaims(token);
		return claimResolver.apply(claims);
	}


	private Claims extractAllClaims(String token) {
		return Jwts
				.parser()
				.verifyWith(getKey())
				.build()
				.parseSignedClaims(token).getPayload();
	}


	public boolean validateToken(String token) {
		final String userName=extractUsername(token);
		return (userName.equals(loginDao.getByUserName(userName))&& !isTokenExpired(token));
	}


	private boolean isTokenExpired(String token) {
		return extractExpiration(token).before(new Date());
	}


	private Date extractExpiration(String token) {
		return extractClaim(token,Claims::getExpiration);
	}

}