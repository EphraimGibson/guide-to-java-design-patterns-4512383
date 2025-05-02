package com.example;

public class TurnOffLightCommand implements LightCommands {

  private final Light light;

  public TurnOffLightCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.turnOffLight();
    light.isOn();
  }

}
