package com.ivoronline.springboot_security_authorization_custom.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  @ResponseBody
  @PreAuthorize("hasAuthority('book.read') AND @authenticationService.authenticate(authentication)")
  @RequestMapping("/ReadBook")
  public String readBook() {
    return "ADMIN and USER can read Book";
  }

}


