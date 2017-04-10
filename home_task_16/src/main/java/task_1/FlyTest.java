package task_1;

/**
 * Created by User on 10.04.2017.
 */
public class FlyTest {
    public static void main(String[] args) {
        System.out.println(Security.HIGH);
        Security.HIGH.setDescription("Here is some rules for high priority security...");
        System.out.println(Security.HIGH);
        System.out.println(Security.HIGH.name());



    }
}
