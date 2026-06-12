public class filterUniqueChar {
    public static void main(String[] args) {
        String a ="vvvvvvvkaaaaaaagggggh";

        for(int i=0;i<a.length();i++){
            char ch =a.charAt(i);
            int count =0;
            for(int j=0;j<a.length();j++){
                if(ch==a.charAt(j)){
                    count++;

                }
            }

            if(count == 1){
                System.out.println(ch);
            }
           

        }
    }
    
}
