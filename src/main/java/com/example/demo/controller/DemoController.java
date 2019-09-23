package com.example.demo.controller;

import com.example.demo.service.DemoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
  @Autowired
  private DemoService service;

  // http://localhost:8080?a=1&b=2
  @GetMapping
  public int index(@RequestParam int a, @RequestParam int b) {
    return service.calc(a, b);
  }
}