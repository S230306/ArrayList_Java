/*Given two ArrayLists of integers, write a Java program to
  combine the two lists into a new ArrayList without duplicates. */
  import java.util.*;

public class ArrayList7 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int idx = 1; idx <= 10; idx++) {
            list1.add(idx);
        }

        ArrayList<Integer> list2 = new ArrayList<>();
        for (int idx = 5; idx <= 10; idx++) {
            list2.add(idx);
        }

        ArrayList<Integer> newList = new ArrayList<>();
        newList.addAll(list1);

        for (int x : list2) {
            if (!newList.contains(x)) {
                newList.add(x);
            }
        }

        System.out.println(newList);
    }
}
