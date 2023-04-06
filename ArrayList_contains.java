import java.util.*;
public class ArrayList_contains {
    public static void main(String[]args){
        ArrayList<Integer> list1 = new ArrayList<>();
        for(int idx=1;idx<=10;idx++){
            list1.add(idx);
        }
        boolean ans = list1.contains(2);
        if(ans){System.out.println("The list contains 2");}
        else{System.out.println("The list is't contains 2");}
    }
}
