package calc;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı 1: ");
        double a = sc.nextDouble();
        System.out.print("Sayı 2: ");
        double b = sc.nextDouble();
        System.out.println("Toplam: " + (a + b));
    }
}
