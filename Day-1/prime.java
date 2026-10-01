import java.util.Scanner;
public class prime
{
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        java.util.Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int i=2;
        while(count<n)
        {
            if(isPrime(i))
            {
                System.out.print(i+" ");
                count++;
            }
            i++;
        }
        sc.close();
    }

}