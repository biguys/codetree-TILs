import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        a += 8;
        b *= 3;
        System.out.printf("%d\n%d\n%d",a,b,a*b);
    }
}