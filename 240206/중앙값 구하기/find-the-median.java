import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        if(a>=b && a>=c){
            if(b>=c)
                System.out.print(b);
            else System.out.print(c);
        }

        else if(b>=c && b>=a){
            if(c>=a)
                System.out.print(c);
            else System.out.print(a);
        }

        else if(c>=a && c>=b){
            if(a>=b)
                System.out.print(a);
            else System.out.print(b);
        }
            
        
    }
}