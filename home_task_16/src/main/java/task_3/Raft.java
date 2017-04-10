package task_3;

/**
 * Created by User on 11.04.2017.
 */
public class Raft extends Boat {
    public Raft(int speed, int numberPassengers) {
        super(speed, numberPassengers);
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int getNumberPassengers() {
        return numberPassengers;
    }
}
