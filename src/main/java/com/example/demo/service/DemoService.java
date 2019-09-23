package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
  public int calc(int a, int b) {
    return a + b;
  }
}
