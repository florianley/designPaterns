package com.designPatern.factory3;

public class Client {
    public static void main (String[] args){
        PetFactory petFactory = new PetFactory();

        Pet pet;

        System.out.println("first pet creation :");
        pet = petFactory.getPet(PetFactory.DOG);
        pet.sound();

        System.out.println("second pet creation :");
        pet = petFactory.getPet(PetFactory.CAT);
        pet.sound();

    }
}
