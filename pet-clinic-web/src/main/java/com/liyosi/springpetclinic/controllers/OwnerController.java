package com.liyosi.springpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liyosi on Aug, 2018
 */
@Controller
@RequestMapping("/owners")
public class OwnerController {

  @RequestMapping({"", "/", "/index", "/index.html"})
  public String listOwners() {
    return "owners/index";
  }
}

