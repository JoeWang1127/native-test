package com.example;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloTest {

  @Test
  public void helloTest() {
    assertEquals("Hello", Hello.hello());
  }
}
