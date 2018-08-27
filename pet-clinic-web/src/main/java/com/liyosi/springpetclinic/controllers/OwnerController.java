package com.liyosi.springpetclinic.controllers;

import com.liyosi.springpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liyosi on Aug, 2018
 */
@Controller
@RequestMapping("/owners")
public class OwnerController {

  private final OwnerService ownerService;

  public OwnerController(OwnerService ownerService) {
    this.ownerService = ownerService;
  }

  @RequestMapping({"", "/", "/index", "/index.html"})
  public String listOwners(Model model) {

    model.addAttribute("owners", ownerService.findAll());

    return "owners/index";
  }

  @RequestMapping({"/find", "oups"})
  public String findOwners() {
    return "notimplemented.html";
  }
}

