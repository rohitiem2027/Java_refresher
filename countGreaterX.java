
// count the number of elements in given array grater than a gien number x
import java.util.Scanner;
public class countGreaterX {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of size : ");
	    int n = sc.nextInt();
        int arr[]=new int[n];
        
        System.out.print("Enter the elements: ");
        for(int i=0;i<arr.length;i++ ){
            arr[i]=sc.nextInt();
            
        }
        
        int element=sc.nextInt();
        
        int count=0;
       System.out.println("No of elements above "+element+":");
        for(int i=0;i<arr.length;i++ ){
            if(arr[i]>element){
                count =count +1;
            }
           

        }
        System.out.println(count);



    }
    
}
