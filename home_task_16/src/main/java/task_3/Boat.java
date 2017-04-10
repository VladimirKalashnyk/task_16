package task_3;

/**
 * Created by User on 11.04.2017.
 */
public abstract class Boat {
    protected int speed;
    protected int numberPassengers;

    public Boat(int speed, int numberPassengers) {
        this.speed = speed;
        this.numberPassengers = numberPassengers;
    }

    public abstract int getSpeed();

    public abstract int getNumberPassengers();

    @Override
    public String toString() {
        return "speed: " + speed + "\t" +
                "numberPassengers: " + numberPassengers;
    }
}
