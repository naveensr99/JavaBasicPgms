public class finbonnaicSeries {


    public static void main(StringInbuiltFunc[] args) {


        //1,1,2,3,4\
        int a=0;
        int b=1;

        int num=10;

        for(int i=0;i<num;i++){
            System.out.print(a+",");
            int c=a+b;
            a=b;
            b=c;
        }


    }
}
