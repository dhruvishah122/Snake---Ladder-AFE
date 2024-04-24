import java.util.*;
import player.Player;
import dice.Dice;

public class App {
    public static void setDetail(Player p) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter name");
        String name = sc.nextLine();
        System.out.println("enter address");
        String address = sc.nextLine();
        System.out.println("enter email");
        String email = sc.nextLine();
        System.out.println("enter age");
        int age = sc.nextInt();
        System.out.println("enter contact");
        long contact = sc.nextLong();
        p.setDetails(name, email, address, age, contact);
        p.getDetails();
    }

    public static void main(String[] args) {

        Player p1 = new Player();
        setDetail(p1);

        Player p2 = new Player();
        setDetail(p2);
        Dice d1 = new Dice();
        System.out.println(d1.Diceroll());
    }
}