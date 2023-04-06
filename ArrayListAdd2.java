/* void add(int index, Object element) : This method inserts the specified
   element E at the specified position in this list.It shifts the element
   currently at that position (if any) and any subsequent elements to the right (will add one to their indices).*/
import java.util.*;
public class ArrayListAdd2 {
    public static void main(String[]args){
        //Declare the arrayList
        ArrayList<Integer> arr = new ArrayList<>();
        // perform the add Method
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        System.out.print("Number ->"+arr);
        System.out.println();
        // adding the number at index 3.
        arr.add(3,45);
        System.out.print("Number  ->"+arr);
    }
}
