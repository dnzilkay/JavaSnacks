// Main.java
import java.util.Scanner;
import weather.WeatherApp;
import dice.DiceRoll;
import fortune.MotivasyonBotu;
import file.DosyaOku;
import calc.HesapMakinesi;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Java Çerezleri ");
        System.out.println("1 - Hava Durumu");
        System.out.println("2 - Zar At");
        System.out.println("3 - Şans Sözü");
        System.out.println("4 - Dosya Oku");
        System.out.println("5 - Hesap Makinesi");
        System.out.print("Seçiminiz: ");
        int sec = sc.nextInt();

        switch (sec) {
            case 1 -> {
                try {
                    WeatherApp.main(null);
                } catch (Exception e) {
                    System.out.println("❌ Hava durumu alınamadı kral: " + e.getMessage());
                }
            }
            case 2 -> DiceRoll.main(null);
            case 3 -> MotivasyonBotu.main(null);
            case 4 -> {
                try {
                    DosyaOku.main(null);
                } catch (Exception e) {
                    System.out.println("❌ Dosya okunurken hata oldu kral: " + e.getMessage());
                }
            }
            case 5 -> HesapMakinesi.main(null);
            default -> System.out.println("❌ Geçersiz seçim kral!");
        }

    }
}
