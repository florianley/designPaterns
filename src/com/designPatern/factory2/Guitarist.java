package com.designPatern.factory2;

public class Guitarist {

    public static void main (String[] args){

        Gibson guitar;
        System.out.println("J'achète ma première guitare");
        guitar = new LesPaul();
        guitar.solo();
        guitar = new SG();
        guitar.solo();

    }

}
