package after.strategy;

public class ModelDuck extends Duck {

    public ModelDuck() {
        // in this example, we are setting the behaviours to concrete classes - can be changed at runtime
        // ideally we would not program to an implementation/concrete classes like below
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck! Almost as famous as Heidi Klum :D");
    }
}
