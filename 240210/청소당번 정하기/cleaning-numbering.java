import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt2=0;
        int cnt3=0;
        int cnt12=0;

        
        for(int i=0; i<n; i++)
        {
            if(n % 2 ==0)
                cnt2 ++;
            else if(n % 3 ==0)
                cnt3 ++;
            else if(n % 12 ==0)
                cnt12 ++;
        }

        System.out.printf("%d %d %d",cnt2,cnt3,cnt12);
    }
}