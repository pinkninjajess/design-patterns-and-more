package after.strategy;

public class MallardDuck extends Duck {

    public MallardDuck() {
        // note: not best practice to program to an implementation as is done below... better to use dependency injection
        // in this example, we are setting the behaviours to concrete classes - can be changed at runtime
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real mallard duck!");
    }
}
