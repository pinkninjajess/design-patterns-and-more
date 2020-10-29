package after.strategy;

/**
 * Strategy Pattern
 * defines a family of algorithms (the duck behaviours),
 * encapsulates each one, and makes them interchangeable.
 * Strategy lets the algorithm vary independently from clients that use it.
 */
public abstract class Duck {

/**
* Design Principle #3
    - Favour composition over inheritance - not only does it let you encapsulate a family of algorithms into their own set of classes,
*     but it also lets you change behaviour at runtime, as long as the object you're composing with implements the correct behaviour interface
* */
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public abstract void display();

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
