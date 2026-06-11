public class numberGetout{
    public static void main(String[] args) {
        String a ="as5!3$j8/*62#"; //53862
        String result="";
        for(int i=0;i<a.length();i++){
            char ch = a.charAt(i);
            if(Character.isDigit(ch)){  
                result = result +ch;

            }
        }
        System.out.println(result);

        
    }
}

/*Remember : Character.isDigit= checks every character digit or not
             Character.isLetter= checks evry character letter or not*/



/* public class CharacterOnly {
    public static void main(String[] args) {

        String str = "as5!3$j8/*62#";

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if ((ch >= 'a' && ch <= 'z') ||
                (ch >= 'A' && ch <= 'Z')) {

                result.append(ch);
            }
        }

        System.out.println(result);
    }
}

/*
public class SpecialCharacters {
    public static void main(String[] args) {

        String str = "as5!3$j8/*62#";  //!$/*#

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (!Character.isLetterOrDigit(ch)) {
                result.append(ch);
            }
        }

        System.out.println(result);
    }
}

*/