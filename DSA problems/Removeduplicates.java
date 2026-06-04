public class Removeduplicates {

    
    public static int Duplicates(int[] nums) {
       
        int n=nums.length;

        int i=0;
        for(int j=1;j<n;j++){
                if(nums[i]!=nums[j]){
                    i++;
                    nums[i]=nums[j];
                }

            }


        return i=i+1;
        }
        
    

        
    
    public static void main(String[] args) {
        int nums[]={1,1,2,3,3,3,4,4,5,5,6,6};
        System.out.println("The length of the unique element : "+Duplicates(nums));
        

    }
    
}
