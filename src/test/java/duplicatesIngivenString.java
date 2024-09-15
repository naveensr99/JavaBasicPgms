public class duplicatesIngivenString {
    public static void main(String[] args) {

    String dup = "saahiin";
    char[] cha = dup.toCharArray();
    int count;

        for(int i=0;i<cha.length;i++){
            count=0;
//            if(cha[i]=='0')
//                continue;
            for(int j=i+1;j<cha.length;j++){
                if(cha[i]==cha[j]){
//                    cha[j]='0';
                    count++;
                }
            }
            if(count>0){
                System.out.print(cha[i]);
            }
        }

    }
}
