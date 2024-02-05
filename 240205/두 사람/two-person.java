import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char as = sc.next().charAt(0);
        int b = sc.nextInt();
        char bs = sc.next().charAt(0);
        System.out.println((a >=19 || b >=19) && (as=='M' || bs=='M') ? "1" : "0");
    }
}