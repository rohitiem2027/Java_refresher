public class linearSearchUsingFlag {
    public static void main(String args []){
        int arr[]={10,11, 12,14,15,45,75,45,41,42};
        boolean flag =false;
        int x=12;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                flag=true;
                break;
            }
        }
        if(flag==false){
            System.out.println("Element got no found");
        }else{
            System.out.println("got found");
        }
    }
    
}
