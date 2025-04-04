public class Oyuncu {
    String isim;
    int seviye;

    public Oyuncu(String isim, int seviye) {
        this.isim = isim;
        this.seviye = seviye;
    }

    public void bilgileriYaz() {
        System.out.println("Oyuncu: " + isim + " | Seviye: " + seviye);
    }

    public static void main(String[] args) {
        Oyuncu kral = new Oyuncu("KodKral", 99);
        kral.bilgileriYaz();
    }
}
