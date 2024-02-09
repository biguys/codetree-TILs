import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0 ;

        for(int i=1; i<=n; i++)
        {
            System.out.print(i % 3 == 0 || (i>11 && i % 3 == 1) || (i>21 && i % 3 == 2) || (i>=30 && i>40) || (i>41 && i % 3 == 2) || (i>51 && i % 3 == 1) || (i>=60 && i>70) || (i>71 && i % 3 == 2) || (i>81 && i % 3 == 1) || (i>=90 && i>100)? "0 "  : i+" ");

            
        }
    }
}