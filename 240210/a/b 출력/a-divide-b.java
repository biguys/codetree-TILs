import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int answer1 = (a) / b;
        int answer2 = (a) % b;
        for(int n=1; n<=21; n++)
        {   
            if(n==1)
            {
                System.out.print(answer1+".");
                answer1 = (answer2*10) / b;
                answer2 = (answer2*10) % b; 
            }
            else
            {
                System.out.print(answer1);
                answer1 = (answer2*10) / b;
                answer2 = (answer2*10) % b; 
            }
        }

    }
}