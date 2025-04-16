public class Faktoriyel {
    public static void main(String[] args) {
        int sayi = 5;
        int sonuc = 1;

        for (int i = 1; i <= sayi; i++) {
            sonuc *= i;
        }

        System.out.println(sayi + "! = " + sonuc);
    }
}
