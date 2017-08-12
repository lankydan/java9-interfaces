package com.lankydan.tutorial;

public class MyClassOverrideDefaultMethod implements MyInterface {

  @Override
  public void normalMethod() {
    System.out.println("Hello from the implemented method!");
  }

  @Override
  public void defaultMethod() {
    System.out.println("I have overridden the default method!!");
  }
}
