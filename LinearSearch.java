import java.util.Scanner;
public class LinearSearch
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int size = scanner.nextInt();
	    
	    int arr []= new int[size];
	    
	    for(int i=0;i<arr.length;i++){
	        arr[i]=scanner.nextInt();
	    }
	    
	    int search = scanner.nextInt();
	    
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]==search){
	        System.out.println("Number found at index"+ i);
	        }
	        
	    }
	    System.out.println("Number is not found");
        
		
	}
}