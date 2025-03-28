package dice;

import java.util.Random;

public class DiceRoll {
    public static void main(String[] args) {
        Random rand = new Random();
        int dice = rand.nextInt(6) + 1;
        System.out.println("🎲 Zar Sonucu: " + dice);
    }
}
