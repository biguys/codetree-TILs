import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<=100; i++)
        {   
           int n = sc.nextInt();
            
            if(n != 0){
            System.out.println(n);
                continue;
            }
            else if (n==0)
                break;
            
            
        }
    }
}