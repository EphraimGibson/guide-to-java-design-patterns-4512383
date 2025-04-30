package com.example;

public class BlueFactory implements interfaceFactory{

  @Override
  public ScrollBar createScrollBar(){
    return new BlueScrollBar();
  }

  @Override
  public Button createButton(){
    return new BlueButton();
  }
}
