package ArrayList;
import java.util.*;


public class StringSortandReverse {
    public static void main(String[] args) {
        ArrayList<String> s1= new ArrayList<>();

        s1.add("My");
        s1.add("is");
        s1.add("name");
        s1.add("Rohit");
        s1.add("Roy");
        
        Collections.reverse(s1);
        System.out.println(s1);
        
        Collections.sort(s1);
        System.out.println(s1);

        Collections.sort(s1,Collections.reverseOrder());
        System.out.println(s1);

    }
    
}
