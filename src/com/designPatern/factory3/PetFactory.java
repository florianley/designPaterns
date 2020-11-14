package com.designPatern.factory3;

public class PetFactory {

    public static final int DOG = 1;
    public static final int CAT = 2;

    Pet getPet(int typePet) {


        switch(typePet){
            case (CAT):
                return new Cat();
            case (DOG):
                return new Dog();
            default:
                throw new IllegalArgumentException("unknown type");
        }
    }

}
