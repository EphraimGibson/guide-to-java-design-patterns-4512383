package com.example;

public class FrenchlanguageAdapter implements LocalizedMessage {
  private final FrenchLocalizedMessage frenchLocalizedMessage;


  FrenchlanguageAdapter(){
    frenchLocalizedMessage = new FrenchLocalizedMessage();
  }

  @Override
  public void sayHello(){
    frenchLocalizedMessage.sayBonjour();
  }
}
