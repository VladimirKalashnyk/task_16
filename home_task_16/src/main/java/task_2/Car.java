package task_2;

/**
 * Created by User on 11.04.2017.
 */
public abstract class Car implements Machine {
    private String name;
    private int currentSpeed;

    public Car(String name, int currentSpeed) {
        this.name = name;
        this.currentSpeed = currentSpeed;
    }

    abstract String getName();
}
