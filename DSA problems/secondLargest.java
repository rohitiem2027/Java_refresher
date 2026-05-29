public class secondLargest {
    public static void main(String args[]){
        int arr[]={10,11, 12,14,15,45,75,43,41,42}; 
        int max =Integer.MIN_VALUE;
        int sec_largest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                sec_largest=max;
                max=arr[i];
            }else if(arr[i]>sec_largest && arr[i]!=max){
                
                sec_largest=arr[i];
            }
        }
        System.out.println(sec_largest);




    }
    
}
