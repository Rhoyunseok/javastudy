import java.util.Scanner;

public class ex100_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        System.out.printf("%o", number);
    }
}
