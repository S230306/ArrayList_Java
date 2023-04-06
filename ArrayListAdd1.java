/*boolean add(Object o) : This method appends the specified element
 to the end of this list */
import java.util.*;
public class ArrayListAdd1 {
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
    }
}
