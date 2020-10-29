package after.strategy;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        // default value of "I can't fly:("
        model.performFly();

        // the behaviour is easily changed at runtime via setters:
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
    }

}
