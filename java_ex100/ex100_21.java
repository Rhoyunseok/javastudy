import java.util.Scanner;

public class ex100_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 두 개의 정수를 입력받습니다.
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // 첫 번째 정수에 2의 두 번째 정수 승을 곱합니다.
        int result = a * (int) Math.pow(2, b);

        System.out.println(result);
    }
}