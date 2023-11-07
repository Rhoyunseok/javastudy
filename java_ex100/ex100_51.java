package java_ex100;

import java.util.Scanner;

public class ex100_51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int compressed = compress(n);
        System.out.println(compressed);
        if (compressed <= 50) {
            System.out.println("GOOD");
        } else {
            System.out.println("OH MY GOD");
        }

    }

    public static int compress(int n) {
        int tens = n / 10;
        int ones = n % 10;
        int swapped = ones * 10 + tens;
        int result = swapped * 2;
        if (result > 100) {
            result = result % 100;
        }
        return result;
    }
}
