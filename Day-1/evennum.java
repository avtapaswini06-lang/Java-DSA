import java.util.Scanner;
public class evennum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int i = 1;
        while(true)
        {
            if(i % 2 == 0)
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