import java.util.Scanner;

public class ex100_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        scanner.close();
        System.out.println(year + "." + month + "." + day + ".");
    }
}
