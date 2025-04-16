import java.util.Scanner;

public class SayiTahmin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gizliSayi = 7;
        int tahmin;

        System.out.println("1 ile 10 arasında bir sayı tahmin et!");

        do {
            System.out.print("Tahminin: ");
            tahmin = scanner.nextInt();

            if (tahmin < gizliSayi) {
                System.out.println("Daha büyük!");
            } else if (tahmin > gizliSayi) {
                System.out.println("Daha küçük!");
            } else {
                System.out.println("Bildin kral 👑!");
            }

        } while (tahmin != gizliSayi);

        scanner.close();
    }
}
