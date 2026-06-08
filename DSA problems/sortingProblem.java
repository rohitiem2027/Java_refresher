public class sortingProblem{
    public static void main(String[] args) {
        String [] arr={"i1","i4","i2","i3","i6","i5"};//Asccii values starts ==> A=65 a=97 0=48

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i].compareTo(arr[j])<0){
                    String temp= arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;



                }
            }
        }

        for(String c : arr){
            System.out.print(c+" ");
        }

        // String arr1 = "i1";
        // String arr2 = "i4";
        

        // System.out.println(arr1.compareTo(arr2)); // Returns a negative value ('A' comes before 'B')




















        // String s1 = "Apple";
        // String s2 = "Banana";
        // String s3 = "Apple";

        // System.out.println(s1.compareTo(s2)); // Returns a negative value ('A' comes before 'B')
        // System.out.println(s1.compareTo(s3)); // Returns 0 (both strings are identical)
        // System.out.println(s2.compareTo(s1)); // Returns a positive value ('B' comes after 'A')


        

        
    }
}