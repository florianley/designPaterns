package com.designPatern.factory;

public class WolksVagenGolfFactory extends WolksVagenFactory {
    @Override
    protected WolksVagenCar createWolksvagen() {
        return new Golf();
    }
}
