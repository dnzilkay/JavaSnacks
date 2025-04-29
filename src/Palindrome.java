import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir kelime girin: ");
        String kelime = scanner.nextLine();

        String duz = kelime.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String ters = new StringBuilder(duz).reverse().toString();

        if (duz.equals(ters)) {
            System.out.println("Bu bir palindromdur.");
        } else {
            System.out.println("Bu bir palindrom değildir.");
        }
    }
}
