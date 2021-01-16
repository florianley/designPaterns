package com.designPatern.abstractFactory;

public class ProductFacroty1 implements IProductFactory{

    @Override
    public ProductA getProductA() {
        return new ProductA1();
    }

    @Override
    public ProductB getProductB() {
        return new ProductB1();
    }
}
