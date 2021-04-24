package com.ivoronline.springboot_security_authorization_custom.services;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class CustomAuthorizationService {

  //==============================================================================
  // AUTHORIZE
  //==============================================================================
  public boolean authorize(Authentication authentication) {

    //GET USERNAME
    UserDetails userDetails = (UserDetails) authentication.getPrincipal();
    String      userName    = userDetails.getUsername();

    //CHECK USERNAME
    return userName.equals("myuser");

  }

}

