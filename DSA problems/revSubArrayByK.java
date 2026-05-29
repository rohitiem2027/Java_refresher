//Given an array arr[] of positive integers. Reverse every sub-array group of size k.
// Note: If at any instance, the remaining elements are fewer than k, reverse all of them.

//geeks for geeks question
// Examples:

// Input: arr[] = [1, 2, 3, 4, 5], k = 3
// Output: [3, 2, 1, 5, 4]
// Explanation: First group consists of elements 1, 2, 3. Second group consists of 4, 5.
// Input: arr[] = [5, 6, 8, 9], k = 5 n n 
// Output: [9, 8, 6, 5]
// Explnation: Since k is greater than the number of remaining elements, the entire array is reversed.

class revSubArrayByK{
    
    public static void arrayPrint(int[]arr){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}
    
    public static void main(String[] args) {
        int arr [] ={1, 2, 3, 4, 5};
        int k = 3;
        int n=arr.length;
 
        for( int i=0;i<n;i=i+k){

            int start= i;//first index
            int end =Math.min(i+k-1,n-1);////5-3-1+1=2//5-3=2//last index
            while(start<end){
            
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                
                start++;
                end--;
            }
            
        }
        arrayPrint(arr);
        
    }
}
 
 
