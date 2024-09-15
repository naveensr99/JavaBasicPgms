public class removeDuplicateFromArray {


    public static void main(String[] args) {


        int[] duplicates={4,5,5,5,6};
        int temp=0;

        for (int i =0;i<duplicates.length-1;i++){
            if(duplicates[i]!=duplicates[i+1]){
                duplicates[temp++]=duplicates[i];
                System.out.println(duplicates[i]);
            }
        }

        for (int duplicate : duplicates) {
            System.out.print(duplicate);
        }


    }
}
