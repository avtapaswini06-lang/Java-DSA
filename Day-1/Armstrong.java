import java.util.Scanner;
class Armstrong
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
        boolean status = isArm(n);
        System.out.println(status);
        sc.close();
    }
}