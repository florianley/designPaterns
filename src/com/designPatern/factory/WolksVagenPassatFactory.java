package com.designPatern.factory;

public class WolksVagenPassatFactory extends WolksVagenFactory {
    @Override
    protected WolksVagenCar createWolksvagen() {
        return new Passat();
    }
}
