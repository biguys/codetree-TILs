import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean a = false;

        for(int i=1; i<=n; i++)
        {
            if(n % 2 == 0 || n % 3 == 0)
                a = true;
        }

        if(a == true)
            System.out.print("C");
        else
            System.out.print("N");
    }
}