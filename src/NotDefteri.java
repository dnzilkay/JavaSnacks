import java.io.*;
import java.util.Scanner;

public class NotDefteri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dosyaAdi = "notlar.txt";

        System.out.println("⏺️ Not defterine bir şeyler yaz (çıkmak için 'exit' yaz):");

        try (FileWriter yazici = new FileWriter(dosyaAdi, true)) {
            String satir;
            while (true) {
                System.out.print("> ");
                satir = scanner.nextLine();

                if (satir.equalsIgnoreCase("exit")) break;

                yazici.write(satir + "\n");
            }

            System.out.println("✅ Notlar kaydedildi!");
        } catch (IOException e) {
            System.out.println("❌ Yazma hatası: " + e.getMessage());
        }

        System.out.println("\n📖 Not defterinin içeriği:");

        try (BufferedReader okuyucu = new BufferedReader(new FileReader(dosyaAdi))) {
            String satir;
            while ((satir = okuyucu.readLine()) != null) {
                System.out.println("- " + satir);
            }
        } catch (IOException e) {
            System.out.println("❌ Okuma hatası: " + e.getMessage());
        }

        scanner.close();
    }
}
