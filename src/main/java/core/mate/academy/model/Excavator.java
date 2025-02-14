package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private static int bucketVelocityLiters;

    public Excavator() {

    }

    public Excavator(String color, String name, int bucketVelocityLiters) {
        super(name, color);
        this.bucketVelocityLiters = bucketVelocityLiters;

    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
