import java.util.*;
//Move all zeros at the end 
public class Amcat2 {
    public static void main(String[] args) {
        int arr[]={1,0,2,0,5,0,3};
        int n=arr.length;

        // int start=0;
        // int end=arr.length;
        // while(start<end){
        //     if(){
        //         int temp = arr[end];
        //         arr[end]=arr[start];
        //         arr[start]=temp;

        //         start++;
        //         end--;
                

        //     }
        // }

        // System.out.println(Arrays.toString(arr));

        // for(int i=0;i<n-1;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(arr[i]==0){
        //             arr[j]=arr[i];
        //         }
        //     }
            
        // }
        // System.out.println(Arrays.toString(arr));
        
        
        int j = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
