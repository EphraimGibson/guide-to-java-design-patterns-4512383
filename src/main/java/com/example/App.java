package com.example;

public class App {


    public static void main(String[] args) {
        UserInterface roadUserInterface = createUserInterface("RED");
        UserInterface mountainUserInterface = createUserInterface("BLUE");

        System.out.println(roadUserInterface);
        System.out.println(mountainUserInterface);

    }


    private static UserInterface createUserInterface(String color) {
        interfaceFactory interfacefactory = FactoryMaker.createInterface(color);
        
        return new UserInterface(interfacefactory.createButton(), interfacefactory.createScrollBar());
    
    }

}

