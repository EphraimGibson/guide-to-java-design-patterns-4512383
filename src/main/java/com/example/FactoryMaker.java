package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class FactoryMaker {
  public static final Map<String, Supplier<interfaceFactory>> interfaceMap = new HashMap<>();

  static{
    interfaceMap.put("red", RedFactory::new);
    interfaceMap.put("blue", BlueFactory::new);
  }

  public static interfaceFactory createInterface(String interfaceType){

    String lowercapString = interfaceType.toLowerCase();

    if (interfaceMap.get(lowercapString) != null){
      return interfaceMap.get(lowercapString).get();
    }
    else{
      throw new IllegalArgumentException("Colour not supported");
    }

  }
}
