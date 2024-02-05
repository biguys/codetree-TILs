import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int am = sc.nextInt(), ae  = sc.nextInt(), bm  = sc.nextInt(), be = sc.nextInt();

        if(am > bm)
            System.out.print("A");
        else System.out.print("B");
        
        if(am ==bm)
            System.out.print(ae > be ? 'A' : "B");
    }
}