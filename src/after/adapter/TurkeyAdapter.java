package after.adapter;

import java.util.stream.IntStream;

/**
 * The adapter, implements the target interface: Duck
 * and holds an instance of the adaptee (Turkey)
 */
public class TurkeyAdapter implements Duck {

    Turkey turkey;

    /**
     * Example of composition
     *
     * @param turkey
     */
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        IntStream.range(0, 5).forEach(i -> turkey.fly());
    }
}
