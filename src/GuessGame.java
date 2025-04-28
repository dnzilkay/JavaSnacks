import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int secretNumber = rand.nextInt(100) + 1;  // 1-100 arası sayı
        Scanner scanner = new Scanner(System.in);
        int guess;
        int attempts = 0;

        System.out.println("🔮 Tahmin Et Kral! 1 ile 100 arasında bir sayı tuttum, bulabilir misin?");

        do {
            System.out.print("Tahminin nedir? ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("Daha büyük bir sayı dene kral!");
            } else if (guess > secretNumber) {
                System.out.println("Biraz fazla yüksek gittin reis, daha küçük!");
            } else {
                System.out.println("💯 Helal kral! Doğru bildin 🎉 Tahmin sayın: " + attempts);
            }
        } while (guess != secretNumber);

        System.out.println("Görüşürüz kral 👑");
    }
}
