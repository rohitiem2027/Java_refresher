package ArrayList;
import java.util.ArrayList;

public class basicProblem {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();

       
        l1.add(6);
        l1.add(8);
        l1.add(4);
        l1.add(9);
       

        // l1.remove(0);
        
        // System.out.println(l1.get(1));
        
        // for(int i=0;i<l1.size();i++){
        //     System.out.print(l1.get(i)+" ");
        // }
        // System.out.println();

        l1.add(1,100);
        System.out.println(l1);
        System.out.println(l1.size());
    }
    
}
