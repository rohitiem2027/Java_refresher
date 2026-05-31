package ArrayList;
import java.util.*;

//write a program to sort arraylist in decending order by using built in method in collection;
public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1= new ArrayList<>();
        l1.add(0);
        l1.add(10);
        l1.add(3);
        l1.add(5);
        l1.add(22);
        l1.add(10);

        System.out.println(l1);
        Collections.sort(l1);// sort method prints value in ascending order;//values print in ascending order
        System.out.println(l1);

        Collections.sort(l1,Collections.reverseOrder());//this line and Collections.reverseOrder() this method prints in decending order
        System.out.println(l1);
    }
    
}
