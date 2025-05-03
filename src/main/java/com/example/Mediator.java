package com.example;

public class Mediator {
  private  TrafficLight trafficLight;
  private  PedestrianCrossingLight pedestrianCrossingLight;

  public Mediator(TrafficLight trafficLight,PedestrianCrossingLight pedestrianCrossingLight){
    this.trafficLight = trafficLight;
    this.pedestrianCrossingLight = pedestrianCrossingLight;
  }

  public void trafficLightchangeToRed(){
    trafficLight.changeToRed();
    pedestrianCrossingLight.changeToGreen();
  }

  public void trafficLightchangeToGreen(){
    pedestrianCrossingLight.changeToRed();
    trafficLight.changeToGreen();
  }
}
