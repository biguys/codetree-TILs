import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        double avg = 0;

        for(int i=0; i<=100; i++)
        {
            int age = sc.nextInt();

            if(age >=20 && age < 30)
           { 
            avg += (double) age;
            
                continue;
           }
           
            else 
                {
                    avg /=  i;

                break;}
        }
            System.out.printf("%.2f",avg);
    }
}