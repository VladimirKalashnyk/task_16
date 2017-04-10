package task_3;

/**
 * Created by User on 11.04.2017.
 */
public class Ship extends Boat {
    private String name;
    private int numberCrew;

    public Ship(int speed, int numberPassengers, String name, int numberCrew) {
        super(speed, numberPassengers);
        this.name = name;
        this.numberCrew = numberCrew;
    }

    public String getName() {
        return name;
    }

    public int getNumberCrew() {
        return numberCrew;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int getNumberPassengers() {
        return numberPassengers;
    }

    @Override
    public String toString() {
        return super.toString() + "\t" +
                "name: " + name + "\t" +
                "numberCrew: " + numberCrew;
    }
}
