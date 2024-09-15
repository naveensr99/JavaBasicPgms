public class Strings {


    public static void main(String[] args) {

        String s="A";
        String s1="A";
        String s2= new String("A");
        String s3= new String("A");

        if(s2==s3){
            System.out.println("its equlas");
        }else{
            System.out.println("false");
        }

        String number="999";
        int phno=Integer.parseInt(number);//its used to convert string into a number


        System.out.println(phno);

        String s5="suresh";
        System.out.println(s5.charAt(1));//it will return the specific character value
        System.out.println(s5.indexOf('u')); // it will return the specific index no from the given string
        int randomNum = (int)(Math.random() * 101);
        System.out.println(randomNum);


    }
}
