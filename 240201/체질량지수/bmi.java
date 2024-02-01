import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int c =b/(a*a);
        if(c>25)
        System.out.printf("%d\nobsity",c);
        else
        System.out.printf("%d",c);
    }
}