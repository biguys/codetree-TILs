import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        if(m <= 2)
            System.out.print("Winter");
        else if(m <= 5)
            System.out.print("Spring");
        else if(m <= 8)
            System.out.print("Summer");
        else if(m <= 11)
            System.out.print("Fall");
    }
}