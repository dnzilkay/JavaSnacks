public class TersYazi {
    public static void main(String[] args) {
        String kelime = "kral";
        String ters = "";

        for (int i = kelime.length() - 1; i >= 0; i--) {
            ters = ters + kelime.charAt(i);
        }

        System.out.println("Ters hali: " + ters);
    }
}
