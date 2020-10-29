package before.strategy;

public class RubberDuck extends Duck {

    @Override
    void quack() {
        System.out.println("Squeak, squeak!");
    }

    @Override
    void display() {
        System.out.println("I'm a yellow, rubber duck!");
    }
}
