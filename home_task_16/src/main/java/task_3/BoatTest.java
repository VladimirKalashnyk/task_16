package task_3;

/**
 * Created by User on 11.04.2017.
 */
public class BoatTest {
    public static void main(String[] args) {
        Boat[] boats = {new Raft(7, 4),
                new Ship(34, 50, "Ship_1", 5)};

        for (Boat b : boats)
            System.out.println(b);
    }
}
