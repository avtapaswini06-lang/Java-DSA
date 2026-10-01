import java.util.Scanner;
public class Armnumber
{
    public static boolean isArm(int n)
    {
        int d=(int)Math.log10(n)+1;
        int sum=0;
        int temp=n;
        while(n>0)
        {
            int r = n % 10;
            sum = sum + (int)Math.pow(r,d);
            n = n / 10;
        }
        if(sum == temp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int i=1;
        while(true)
        {
            if(isArm(i))
            {
                System.out.print(i + " ");
                count++;              
            }
            if(count == n)
            {
                break;
            }
            i++;
        }
        sc.close();
    }
}