package DesignPatternsPractice.Creational;

interface AbstractFactoryExample {
    ProductA createProductA();
    ProductB createProductB();
}


interface ProductA {
    void operationA();
}

interface ProductB {
    void operationB();
}

class ConcreteProductA1 implements ProductA {
    public void operationA() {
        // Implementation specific to ConcreteProductA1
        System.out.println("Inside A1");
    }
}

class ConcreteProductB1 implements ProductB {
    public void operationB() {
        // Implementation specific to ConcreteProductB1
        System.out.println("Inside B1");
    }
}

class ConcreteProductA2 implements ProductA {
    public void operationA() {
        // Implementation specific to ConcreteProductA2
        System.out.println("inside A2");
    }
}

class ConcreteProductB2 implements ProductB {
    public void operationB() {
        System.out.println("inside B2");
        // Implementation specific to ConcreteProductB2
    }
}


class ConcreteFactory1 implements AbstractFactoryExample {
    public ProductA createProductA() {
        return new ConcreteProductA1();
    }

    public ProductB createProductB() {
        return new ConcreteProductB1();
    }
}

class ConcreteFactory2 implements AbstractFactoryExample {
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }

    public ProductB createProductB() {
        return new ConcreteProductB2();
    }
}



public class AbstractFactory {
    public static void main(String[] args) {
        ProductA pa = new ConcreteProductA2();
        pa.operationA();
    }
}
