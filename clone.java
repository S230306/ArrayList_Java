import java.util.*;
public class clone{
    public static void main(String[]args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(13);
        arr.add(14);
        arr.add(29);
        arr.add(248);
        System.out.println(arr+" ");
        System.out.println();
        for(int x:arr){
            System.out.println(x+" ");
        }
        // clone the array.
        System.out.println(arr.clone());
    }
}