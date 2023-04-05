import java.util.ArrayList;
public class ArrayList1{
    public static void main(String[]args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(13);
        arr.add(14);
        arr.add(29);
        arr.add(248);
        System.out.print(arr+" ");
        System.out.println();
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}