package com.designPatern.factory;

public abstract class WolksVagenFactory {

    public WolksVagenCar getWolkvagenCar(){
        return createWolksvagen();
    }
    protected abstract WolksVagenCar createWolksvagen();
}
