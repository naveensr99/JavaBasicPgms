import net.bytebuddy.implementation.bytecode.ShiftRight;

public class StringInbuiltFunc {

    public static void main(String[] args) {



        String str="abcdef";
        //used ot print the length of the string
        System.out.println(str.length());

        String str1="abc def geg";
        //Used to print only the specific character of the string
        System.out.println(str1.charAt(2));

        //Used to remove the extra spaces
        String str2="   dgdgg   ddd   dd";
        String s=str2.trim();
        System.out.println(s);

        //used to split the words on given character
        String str4="abc-def-gdg-gee";
        String[] stringarr=str4.split("-");
        for(String n:stringarr){
            System.out.println(n);
        }

        





    }
}
