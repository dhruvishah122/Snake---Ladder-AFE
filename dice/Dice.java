package dice;

public class Dice {
    int MIN = 1;
    int MAX = 6;

    public int Diceroll() {
        double d = (Math.random() * (MAX - MIN)) + MIN;
        return (int) d;
    }
}
