package com.designPatern.factory2;

public class Guitarist {

    public static void main (String[] args){
        LesPaulFactory lesPaulFactory = new LesPaulFactory();

        Gibson guitar;

        System.out.println("J'achète ma première quitare");
        guitar = new LesPaul();
        guitar.solo();

    }

}
