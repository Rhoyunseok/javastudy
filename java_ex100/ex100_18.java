import java.util.Scanner;

public class ex100_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char c = str.charAt(0);
        int ascii = (int) c;
        System.out.println(ascii);
    }
}