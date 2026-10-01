import java.util.Scanner;
public class ArrayReverse{
    public void reverse(int[] a)
    {
        int i=0;
        int j=a.length-1;
        while(i<j)
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int[] a={10,20,30,40,50};
        ArrayReverse ae=new ArrayReverse();
        ae.reverse(a);
        System.out.print("Reversed array: ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}