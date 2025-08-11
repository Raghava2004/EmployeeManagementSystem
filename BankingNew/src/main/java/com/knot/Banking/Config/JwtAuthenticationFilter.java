/*
 * package com.knot.Banking.Config;
 * 
 * import java.io.IOException; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.security.authentication.
 * UsernamePasswordAuthenticationToken; import
 * org.springframework.security.core.context.SecurityContextHolder; import
 * org.springframework.security.core.userdetails.UserDetails; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.stereotype.Component; import
 * org.springframework.web.filter.OncePerRequestFilter; import
 * com.knot.Banking.ServiceImpl.JWTService; import jakarta.servlet.FilterChain;
 * import jakarta.servlet.ServletException; import
 * jakarta.servlet.http.HttpServletRequest; import
 * jakarta.servlet.http.HttpServletResponse;
 * 
 * @Component public class JwtAuthenticationFilter extends OncePerRequestFilter{
 * 
 * @Autowired private UserDetailsService userDetailsService;
 * 
 * @Autowired private JWTService jwtService;
 * 
 * @Override protected void doFilterInternal(HttpServletRequest request,
 * HttpServletResponse response, FilterChain filterChain) throws
 * ServletException, IOException { final String
 * authHeader=request.getHeader("Authorization"); final String jwt; final String
 * username;
 * 
 * System.out.println("Authorization Header: "+authHeader);
 * 
 * if(authHeader == null ||!authHeader.startsWith("Bearer")) { doFilter(request,
 * response, filterChain); return; } jwt=authHeader.substring(7);
 * username=jwtService.extractUsername(jwt);
 * 
 * System.out.println("Token "+ jwt); System.out.println("User name "+
 * username); if(username !=null &&
 * SecurityContextHolder.getContext().getAuthentication()==null) { UserDetails
 * userDetails=this.userDetailsService.loadUserByUsername(username);
 * if(jwtService.validateToken(jwt,userDetails)) {
 * UsernamePasswordAuthenticationToken authToken= new
 * UsernamePasswordAuthenticationToken(username,
 * null,userDetails.getAuthorities());
 * SecurityContextHolder.getContext().setAuthentication(authToken); } }
 * filterChain.doFilter(request, response); }
 * 
 * 
 * 
 * }
 */