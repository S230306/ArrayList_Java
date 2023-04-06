// colone method -clone is use to give shallow copy of given Object.
class Test{
    int a;
    int b;
    Test(){
        a =10;
        b =20;
    }
}
public class ArrayListCLone {
    public static void main(String[]args){
        Test t1 = new Test();
        System.out.println(t1.a+" "+t1.b);
        Test t2 = t1;
        t2.a = 100;
        System.out.println(t1.a+" "+t1.b);
        System.out.println(t2.a+" "+t2.b);
    }
}
