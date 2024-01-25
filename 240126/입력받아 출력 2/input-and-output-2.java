import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        /* - useDelimiter -
        sc.useDelimiter("-");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.printf("%d%d",a,b);
        */

        String a = sc.next();
        String[] b = a.split("-");
        System.out.printf("%s%s",b[0],b[1]);
        

    }
}