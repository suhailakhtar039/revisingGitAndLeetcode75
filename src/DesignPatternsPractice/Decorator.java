package DesignPatternsPractice;

abstract class BasePizza{
    public abstract int cost();
}

class FarmHouse extends BasePizza{

    @Override
    public int cost() {
        return 200;
    }
}

class VegDelight extends BasePizza{
    @Override
    public int cost(){
        return 300;
    }
}

class Magherita extends BasePizza{

    @Override
    public int cost() {
        return 400;
    }
}
// decorator
abstract class ToppingDecorator extends BasePizza{
}

class ExtraCheese extends ToppingDecorator{

    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 10;
    }
}

public class Decorator {
    public static void main(String[] args) {
        // ExtraCheese extraCheese = new ExtraCheese();
    }
}
