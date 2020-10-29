package after.strategy;

/**
 * Design Principle #2
 * - Program to an interface/super type, not an implementation
 *
 * - the Duck behaviours will live in a separate class - a class that implements a particular behaviour interface.
 *   That way, the Duck classes won't need to know any of the implementation details for their own behaviours
 */
public interface FlyBehaviour {

    public void fly();

}
