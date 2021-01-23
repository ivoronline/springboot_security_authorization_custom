package com.ivoronline.springboot_security_authorization_custom.services;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationService {

  public boolean authenticate(Authentication authentication) {
    UserDetails user = (UserDetails) authentication.getPrincipal();
    System.out.println(user.getUsername());
    return true;
  }

}

