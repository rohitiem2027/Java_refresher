import java.util.Arrays;

class twoSum {
    public static void main(String[] args) {
        int arr []={10,20,50,40,60,30};
        int x= 30;
        int arr1[]=new int[2];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==x){
                    arr1[0]=i;
                    arr1[1]=j;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr1));

    }
}