import java.util.Scanner;

public class ex100_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("0 ~ 255 범위의 10진수를 입력하세요:");
        int num = scanner.nextInt();
        char c = (char) num; // 10진수를 문자로 변환
        System.out.println("입력 받은 10진수에 해당되는 아스키 문자는 " + c + "입니다.");
    }
}