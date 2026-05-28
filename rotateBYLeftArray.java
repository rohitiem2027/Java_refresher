//rotate by left means left er duto element sesh a jabeeh;
//korte hoba vlo kore bujte hoba
import java.util.Arrays;



    class rotateBYLeftArray {

    // Function to reverse array
    public static void reverse(int arr[], int start, int end) {

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        
    }

    public static void main(String args[]) {
        int arr []={1,2,3,4,5};
        int d=2;

        int n = arr.length;

        // Handle d greater than array size
        d = d % n;//2%5=1
        


        // Reverse first d elements
        reverse(arr, 0, d - 1);

        // Reverse remaining elements
        reverse(arr, d, n - 1);

        // // Reverse whole array
        reverse(arr, 0, n - 1);

        System.out.println(Arrays.toString(arr));
    }
}

        
    
    
    

