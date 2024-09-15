public class removeDuplicateArrays {


    public static void main(StringInbuiltFunc[] args) {

        int[] a={2,5,5,4,4};
        int count;
        for(int i=0;i<a.length;i++){
            count=0;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
            if(count>0){
                System.out.print(a[i]);
            }
        }
    }
}
