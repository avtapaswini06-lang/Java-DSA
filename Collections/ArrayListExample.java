import java.util.*;
public class ArrayListExample
{
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        a.add(2,70);
        System.out.println(a);
        a.remove(3);
        System.out.println(a);
        System.out.println(a.contains(70));
        a.set(2,80);
        System.out.println(a);
        System.out.println(a.get(1));
        System.out.println(a.indexOf(50));
        a.add(80);
        System.out.println(a);
        System.out.println(a.lastIndexOf(80));

    }
}