import java.util.Scanner;

public class ex100_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        char c = (char) num; // 10진수를 문자로 변환
        System.out.println( c );
    }
}