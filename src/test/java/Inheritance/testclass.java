package Inheritance;

public class testclass {

    public static void main(String[] args) {


        //heap memory and stack memory
        //Upcasting
//        ParentClass p=new ChildClass();
//
//        ParentClass p1=new ParentClass();
//        p.start();

        //can we override static methods??

        //in java we cannt do the downcasting

        //Downcasting
//        ChildClass c= new ChildClass();
//        c.start();



        String name="saamaaacccddddddddddddddeeeeeeeeeeee";
        char[] ch=name.toCharArray();
        String ne="";
        for(int i=0;i<ch.length;i++){
            if(!ne.contains(String.valueOf(ch[i]))){
                ne=ne+ch[i];
            }
        }
        System.out.println(ne);

        String duplicate="";

        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    if(!duplicate.contains(String.valueOf(ch[i]))){
                    duplicate=duplicate+ch[i];
//                    System.out.print(ch[i]);
                }
            }
        }
    }
        System.out.println(duplicate);

}}

