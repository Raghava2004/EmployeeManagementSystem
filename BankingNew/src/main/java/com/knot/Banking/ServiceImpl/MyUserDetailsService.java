/*
 * package com.knot.Banking.ServiceImpl;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.security.core.userdetails.UserDetails; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.security.core.userdetails.UsernameNotFoundException;
 * import org.springframework.stereotype.Service;
 * 
 * import com.knot.Banking.Dao.LoginDao; import
 * com.knot.Banking.Model.LoginModel; import
 * com.knot.Banking.Model.UserPrincipal;
 * 
 * @Service public class MyUserDetailsService implements UserDetailsService {
 * 
 * @Autowired private LoginDao loginDao;
 * 
 * @Override public UserDetails loadUserByUsername(String username) throws
 * UsernameNotFoundException { LoginModel user =
 * loginDao.getByUserName(username); if (user == null) {
 * System.out.println("User Not found"); throw new
 * UsernameNotFoundException("user not found"); }
 * 
 * return new UserPrincipal(user); }
 * 
 * }
 */