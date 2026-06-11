
//Reverse each word only

public class SentenceWordCharaterReverse {
    public static void main(String[] args) {
        String name = "My name is Rohit Roy";

        String [] words=name.split(" ");
        for(int i=0;i<words.length;i++){
            String word = words[i];

            for(int j =word.length()-1;j>=0;j--){
                System.out.print(word.charAt(j));
            }

            System.out.print(" ");
            
            

            
            
        }
    }
    
}


//Reverse both word order and characters
/* 
public class SentenceWordCharacterReverse {
    public static void main(String[] args) {

        String name = "My name is Rohit Roy";

        String[] words = name.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {

            String word = words[i];

            for (int j = word.length() - 1; j >= 0; j--) {
                System.out.print(word.charAt(j));
            }

            System.out.print(" ");
        }
    }
}

*/
