package Constructor;

public class Demo {
    int a;
    int b;
    int c;
    String sa;

    public void add(){
        System.out.println(b+c);
        System.out.println(sa);
    }

    public Demo(int a){
        this.a=a;
        System.out.println(a);
    }

    public Demo(int a, int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;

    }
    public static void main(String[] args) {

        Demo d =new Demo(2);
        d.add();
    }

}
