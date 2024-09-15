import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;

public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {
        ArrayList<Integer> numbers1=new ArrayList<>();
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);


        ArrayList<Integer> numbers=new ArrayList<>();

        numbers.add(5);
        numbers.addLast(44);
        numbers.add(6);


        System.out.println(numbers);
//        numbers.clear();
        System.out.println(numbers);

        numbers.addAll(numbers1);// addAll is used to combine two arraylist

        System.out.println(numbers);






    }
}
