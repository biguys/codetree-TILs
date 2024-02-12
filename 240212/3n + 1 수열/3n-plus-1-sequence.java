import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        while(n != 1)
        {
            if(n % 2 ==0)
            {
                n /= 2;
                answer +=1;
            }
            else if(n % 2 == 1)
            {
                n = n*3+1;
                answer +=1;
            }
            else if(n==1)
                break;

        }
        System.out.println(answer);
    }
}