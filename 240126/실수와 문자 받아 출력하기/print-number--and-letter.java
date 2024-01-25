import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        double b = sc.nextDouble(), c = sc.nextDouble();
        System.out.printf("%s\n%.2f\n%.2f",a,b,c);
    }
}