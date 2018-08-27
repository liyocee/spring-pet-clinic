package com.liyosi.springpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liyosi on Aug, 2018
 */
@Controller
public class IndexController {

  @RequestMapping({"/", "", "index", "index.html"})
  public String index() {
    return "index";
  }


  @RequestMapping( "/oups")
  public String findOwners() {
    return "notimplemented.html";
  }
}
