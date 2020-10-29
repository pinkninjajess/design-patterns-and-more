package after.decorator;

/**
 * Decorator classes mirror the type of the components they decorate
 *  (They are the same type as the components they decorate, either through inheritance or interface implementation)
 *
 *  We're using inheritance to achieve type matching, but we aren't using inheritance to get behaviour
 *
 *  (Head First Design Patterns)
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
