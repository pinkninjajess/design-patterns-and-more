package after.strategy;

public class RubberDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I'm a yellow, rubber duck!");
    }

    public RubberDuck() {
        // ideally we would not program to an implementation/concrete classes like below
        setFlyBehaviour(new FlyNoWay());
        setQuackBehaviour(new Squeak());
    }
}
