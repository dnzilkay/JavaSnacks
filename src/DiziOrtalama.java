public class DiziOrtalama {
    public static void main(String[] args) {
        int[] sayilar = {10, 20, 30, 40, 50};
        int toplam = 0;

        for (int sayi : sayilar) {
            toplam += sayi;
        }

        double ortalama = (double) toplam / sayilar.length;
        System.out.println("Ortalama: " + ortalama);
    }
}
