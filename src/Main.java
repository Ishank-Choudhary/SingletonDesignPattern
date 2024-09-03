import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // Both football object will point to the same refrence
        Football football1 = Football.getPlayer();
        System.out.println(football1);
        Football football2 = Football.getPlayer();
        System.out.println(football2);

        Cricket cricket1 = Cricket.getPlayer();
        System.out.println(cricket1);
        Cricket cricket2 = Cricket.getPlayer();
        System.out.println(cricket2);

        Badminton badminton1 = Badminton.getPlayer();
        System.out.println(badminton1);
    }
}