package com.designPatern.factory2;

public class Es335Factory extends GibsonFactory {

    @Override
    protected Gibson createGibson() { return new Es335(); }
}
