public class AsalSayiKontrol {
    public static void main(String[] args) {
        int sayi = 29;
        boolean asal = true;

        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                asal = false;
                break;
            }
        }

        System.out.println(sayi + (asal ? " asal bir sayıdır." : " asal değildir."));
    }
}
