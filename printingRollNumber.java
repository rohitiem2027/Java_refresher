
public class printingRollNumber {
    public static void main(String args[]){
        int arr []= {10,12,15,14, 30 ,40, 78,12,85};

        int n = arr.length;
        System.out.println("Below 35 marks are :");
        for(int i=0;i<n;i++){
            if(arr[i]<35){
                System.out.print(i+" ");
            }

        }
    }
    
}
