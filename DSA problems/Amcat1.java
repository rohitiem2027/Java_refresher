/*

The function/method sameElementCount returns an integer representing the number of elements of the input list which are:

Even numbers, and
Equal to the element immediately to their right.
Example

If the input list is:

[4, 4, 4, 1, 8, 4, 1, 1, 2, 2]

then the function/method should return:

3

because there are three adjacent pairs of equal even numbers:

(4, 4)
(4, 4)
(2, 2)*/


public class Amcat1 {
    public static void main(String[] args) {

    int arr []= {4, 4, 4, 1, 8, 4, 1, 1, 2, 2};//10
    int n =arr.length;
    System.out.println(n);

    int count =0;

    for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] % 2 == 0 && arr[i] == arr[i + 1]) {
            count++;
        }
    }
    // for (int i=0;i<arr.length-1;i++){
    //     for(int j=i+1;j<arr.length;j++){
    //         if (arr[i]==arr[j] && arr[i&j]%2==0 ) {
    //             count +=1;

    //         }

    //     }
        
    // }
    System.out.println(count);

    
        
    }
    
}
