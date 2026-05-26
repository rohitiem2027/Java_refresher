import java.util.Scanner;
public class calculateSum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the arry array size: ");
        int n = sc.nextInt();
        int arr[]=new int[n];
        int sum =0;
        // int arr[]={10,20,30,40,50,60};
        System.out.print("Enter the arry elements : ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for (int i=0;i<n;i++){
            sum +=arr[i];
        }
        System.out.println("The sum of all array elements: "+sum);
    }
    
}
