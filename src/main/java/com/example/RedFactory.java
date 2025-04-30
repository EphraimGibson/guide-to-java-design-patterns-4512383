package com.example;

public class RedFactory implements interfaceFactory{
  @Override
  public ScrollBar createScrollBar() {
    return new RedScrollBar();
  }

  @Override
  public Button createButton() {
    return new RedButton();
  }
}
