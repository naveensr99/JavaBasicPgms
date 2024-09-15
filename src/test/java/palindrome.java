public class palindrome {

    public static void main(String[] args) {

        String a="maama";
        String reverseA="";
        for(int i=a.length()-1;i>=0;i--){
            reverseA=reverseA + a.charAt(i);
        }
        System.out.println(reverseA);

        if(a.equals(reverseA)){
            System.out.println("its an palindrome");
        }
        else {
            System.out.println("its not an palindrome");
        }
    }
}
