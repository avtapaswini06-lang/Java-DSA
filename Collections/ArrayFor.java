import java.util.ArrayList;
import java.util.Scanner;
public class ArrayFor
{
    public static void main(String args[])
    {
        ArrayList<Integer> a = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            a.add(sc.nextInt());
        }
        /*for(int i=0;i<a.size();i++)
        {
            System.out.println(a.get(i)+" ");
        }*/
       for(Integer i:a)
       {
        System.out.print(i+" ");
       }
        sc.close();
    }
}