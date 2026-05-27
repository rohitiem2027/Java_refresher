public class palindrome {
    public static void main(String[] args) {
        int num =121;
        int reverse=0;

        while(num>0){
            int digit=num%10;//last digit
            reverse= reverse*10+digit;
            num=num/10;


            
        }
        System.out.println(reverse);
        
    }
    
}
