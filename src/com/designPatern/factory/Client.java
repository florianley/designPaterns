package com.designPatern.factory;

public class Client {
    public static void main (String[] args){
        WolksVagenCar myCar ;

        System.out.println("use of first Factory");
        myCar = new Golf();
        myCar.methodeA();

        System.out.println("use of second Factory");
        myCar = new Passat();
        myCar.methodeA();
    }
}
