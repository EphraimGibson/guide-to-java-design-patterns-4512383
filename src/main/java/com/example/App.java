package com.example;

public class App {

    public static void main(String[] args) {
        var light = new Light();
        light.isOn();

        SwitchExecutor.executeOperation(new TurnOnLightCommand(light));
        SwitchExecutor.executeOperation(new TurnOffLightCommand(light));

    }

}
