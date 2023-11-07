import java.util.Scanner;

public class ex100_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float number = scanner.nextFloat();
        scanner.close();
        System.out.printf("%.2f", number);
    }
}