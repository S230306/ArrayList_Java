/*addAll() method */
import java.util.*;
public class ArrayListAddAll{
    public static void main(String[]args){
        ArrayList<Integer> list1 = new ArrayList<>();
        for(int idx=1;idx<=10;idx++){
            list1.add(idx);
        }
        for(int x:list1){System.out.print(x+" ");}
        System.out.println();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int idx=11;idx<=20;idx++){
            list2.add(idx);
        }
        for(int x:list2){System.out.print(x+" ");}
        // now perform the add All Method
        System.out.println();
        list1.addAll(list2);
        for(int x:list1){System.out.print(x+" ");}
    }
}