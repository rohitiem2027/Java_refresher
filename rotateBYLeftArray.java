//rotate by left means left er duto element sesh a jabeeh;
//korte hoba vlo kore bujte hoba
import java.util.Arrays;

public class rotateBYLeftArray {
    public static void main(String[] args) {
        int arr []= {10,20,30,12,13,45,25};
        int n=arr.length;//7
        int k=3;//ata aamke rotate korate hoba//4
        int start =0;//start index
        int end =n-k-1;//7-3-1

        while(start<end){
            int temp =arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
            
        }
        System.out.print(Arrays.toString(arr));
    }
    
    
}
