import java.util.*;
public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int n =sc.nextInt();

        int first=0;
        int second=1;
        for(int i=2;i<=n;i++){
            int result =first+second;
            System.out.print(result+" ");

            first=second;
            second=result;

        
        }
          
    }
    
}



