package com.designPatern.factory;

public class Client {
    public static void main (String[] args){
        WolksVagenFactory wolksVagenGolfFactory = new WolksVagenGolfFactory();
        WolksVagenFactory wolksVagenPassatFactory = new WolksVagenPassatFactory();

        WolksVagenCar produitA ;

        System.out.println("Utilisation de la première fabrique");
        produitA = wolksVagenGolfFactory.createWolksvagen();
        produitA.methodeA();

        System.out.println("Utilisation de la deuxième fabrique");
        produitA = wolksVagenPassatFactory.createWolksvagen();
        produitA.methodeA();
    }
}
