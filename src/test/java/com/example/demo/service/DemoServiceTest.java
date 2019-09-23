package com.example.demo.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoServiceTest {
  @Autowired
  private DemoService service;

  @Test
  public void 引数として1と2を渡すと3が返ること() {
    assertEquals(3, service.calc(1, 2));
  }
}