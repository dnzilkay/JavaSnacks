public class TersKelimeKontrol {
    public static void main(String[] args) {
        String kelime = "kayak";
        String ters = new StringBuilder(kelime).reverse().toString();

        if (kelime.equals(ters)) {
            System.out.println(kelime + " bir palindromdur.");
        } else {
            System.out.println(kelime + " palindrom değildir.");
        }
    }
}
