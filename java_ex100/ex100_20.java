import java.util.Scanner;

public class ex100_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 세 개의 정수를 입력받습니다.
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // 세 개의 정수의 합계를 계산합니다.
        long sum = (long) num1 + num2 + num3;

        // 평균을 계산하고, 소수점 이하 둘째 자리에서 반올림하여 첫째 자리까지 출력합니다.
        double average = Math.round(sum / 3.0 * 10) / 10.0;

        System.out.println(sum);
        System.out.println(average);
    }
}