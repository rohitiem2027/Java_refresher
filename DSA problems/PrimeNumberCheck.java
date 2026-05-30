import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number to check prime or not : ");

        int num = sc.nextInt();
        boolean flag = true;

        if (num <= 1) {
            flag = false;
        } else {

            for (int i = 2; i < num/2; i++) {

                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
        }

        if (flag == true) {
            System.out.println("The number is prime.");
        } else {
            System.out.println("The number is not prime.");
        }
    }
}