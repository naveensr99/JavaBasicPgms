public class dups {


    public static void main(String[] args) {




        String s="saachiin";
        char[] dup=s.toCharArray();
        int count;
        for(int i=0;i<dup.length;i++){
            count=0;
            for (int j=i+1;j<dup.length;j++){
                if(dup[i]==dup[j]){
                    count++;
                }
            }
            if (count>0){
                System.out.print(dup[i]);
            }
        }
    }
}
