package ArrayList;
import java.util.ArrayList;

public class basicProblem {
    public static void main(String[] args) {
        
        //wrapper class =  a class whose object contains or wraps primitive data type.
        Integer f1= Integer.valueOf(100);
        System.out.println(f1);
        
        Float f2= Float.valueOf(5.6f);
        System.out.println(f2);

        //Declaration of ArrayList;
        ArrayList<Integer> l1=new ArrayList<>();

        //add new element by la.add();
        l1.add(6);
        l1.add(8);
        l1.add(4);
        l1.add(9);
       

        //get an element at index i;
        System.out.println(l1.get(0));
        // System.out.println(l1.get(1));


        //print with for loop by the method of ===   size();
        // for(int i=0;i<l1.size();i++){
        //     System.out.print(l1.get(i)+" ");
        // }
        // System.out.println();
        // System.out.println(l1.size());


        //printing the array list directly.
        // System.out.println(l1);


        //adding element at some index;
        l1.add(2,56);
        System.out.println(l1);


        //modifying element at index i particularly; means change the element at particular index;
        l1.set(3,102);
        System.out.println(l1);

        //removing an eleement at index i;
        l1.remove(0);
        System.out.println(l1);
        
        
        //removing an element without knowing index;
        System.out.println(l1.remove(Integer.valueOf(102)));
        l1.remove(Integer.valueOf(102));
        System.out.println(l1);

        //checking if an element exists
        System.out.println(l1.contains(Integer.valueOf(60)));
        System.out.println(l1.contains(Integer.valueOf(9)));

        //if you don't specify wrapper class inside inside the declarion of Arraylist , you can put anything inside the Arraylist
        ArrayList l2= new ArrayList();
        l2.add("Hriddha");
        l2.add("Anushka");
        l2.add("Rohit");
        l2.add(true);
        l2.add(123);

        System.out.println(l2);


        
        
        
        
        
      
       
    }
    
}
