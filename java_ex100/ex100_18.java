import java.util.Scanner;

public class ex100_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("영문자 한 개를 입력하세요:");
        String str = scanner.nextLine();
        char c = str.charAt(0);
        int ascii = (int) c;
        System.out.println("입력 받은 문자의 아스키코드값은 " + ascii + "입니다.");
    }
}