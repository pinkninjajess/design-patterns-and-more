package after.observerdiy;

/**
 * The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state,
 * all of its dependents are notified and updated automatically
 */
// also called a subject
public interface Observable {

    void addObserver(Observer o);

    void removeObserver(Observer o);

}
