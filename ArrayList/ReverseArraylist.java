package ArrayList;
import java.util.ArrayList;
import java.util.Collections;


//write  a program to reverse the array

public class ReverseArraylist {

    // static void reverseList(ArrayList<Integer>l1){
    //     int start=0;
    //     int end =l1.size()-1;

    //     while(start<end){
    //         Integer temp=Integer.valueOf(l1.get(start));
    //         l1.set(start,l1.get(end));
    //         l1.set(end,temp);
           


    //         start++;
    //         end--;

    //     }

    // }
    public static void main(String[] args) {
        ArrayList<Integer> l1= new ArrayList<>();
        l1.add(0);
        l1.add(10);
        l1.add(3);
        l1.add(5);
        l1.add(22);
        l1.add(10);

        System.out.println(l1);
        Collections.reverse(l1);//collection is a class and reverse is a method

        // reverseList(l1); //using function call reverse ArrayList
        System.out.println(l1);
        
        
        
    }
    
}
