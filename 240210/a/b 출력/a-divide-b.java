import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int answer1 = (a*10) / b;
        int answer2 = (a*10) % b;
        double answer3 = (double) a/b;
        System.out.printf("%.0f",answer3);
        for(int n=1; n<=20; n++)
        {
            System.out.print(answer1);
            answer1 = (answer2*10) / b;
            answer2 = (answer2*10) % b; 
        }

    }
}