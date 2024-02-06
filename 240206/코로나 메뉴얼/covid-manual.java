import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        int ax = sc.nextInt();
        char b = sc.next().charAt(0);
        int bx = sc.nextInt();
        char c = sc.next().charAt(0);
        int cx = sc.nextInt();

        if((a == 'Y' && b == 'Y') || (a == 'Y' && c == 'Y') || (b == 'Y' && c == 'Y'))
            {
                if((ax>=37 && bx>=37) || (ax>=37 && cx>=37) || (bx>=37 && cx>=37) )
            System.out.print("E");
            }
        else System.out.print("N");
    }
}