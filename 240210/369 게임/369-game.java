import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0 ;

        for(int i=1; i<=n; i++)
        {
            System.out.print(i % 3 == 0 || i % 10 == 3 || i % 10 == 6 || i % 10 == 9 || (i>=30 && i<40) || (i>=60 && i<70) || (i>=90) ? "0 "  : i+" ");

            
        }
    }
}