import java.util.Scanner;

public class ex100_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 두 개의 정수를 입력받습니다.
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // 첫 번째 정수가 두 번째 정수보다 큰 경우 1을, 그렇지 않은 경우 0을 출력합니다.
        if (a != b) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}