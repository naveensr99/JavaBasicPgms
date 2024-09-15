public class patternMatching {


    public static void main(String[] args) {

    int[] arr={2,5,2,6,7,5};
        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum=arr[i]+sum;
        }


        //max of array
        int max=arr[0];


        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("largest number in the given array is :"+ max);


        int min=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Smallest number in the given array is :"+ min);


        int count;
        for(int i=0;i<arr.length;i++){
            count=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>0){
                System.out.print("duplicate value in the given array"+arr[i]);
            }
        }





    }
}
