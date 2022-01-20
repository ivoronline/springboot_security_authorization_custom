package com.ivoronline.springboot_security_authorization_custom.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //==============================================================================
  // HELLO
  //==============================================================================
  @PreAuthorize("hasRole('USER') AND @customAuthorizationService.authorize(authentication)")
  @RequestMapping("Hello")
  String hello() {
    return "Hello from Controller";
  }

}


