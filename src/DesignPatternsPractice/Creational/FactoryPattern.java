package DesignPatternsPractice.Creational;

import java.util.Objects;

interface shape{
    void myshape();
}

class Square implements shape {

    @Override
    public void myshape() {
        System.out.println("I am SQUARE");
    }
}

class Rectangle implements shape{

    @Override
    public void myshape() {
        System.out.println("I am RECTANGLE");
    }
}

class Factory{
    public shape shapeFactory(String shape){
        if(Objects.equals(shape, "SQUARE"))
            return new Square();
        else if(Objects.equals(shape, "RECTANGLE"))
            return new Rectangle();
        return null;
    }
}

public class FactoryPattern {
    public static void main(String[] args) {
        Factory factory = new Factory();
        shape shape = factory.shapeFactory("SQUARE");
        shape.myshape();
    }
}
