import java.util.Scanner;
public class Target {
    public static int findTarget(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target <= arr[i]) {
                return i;
            }
        }
        return arr.length;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int target = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int result = findTarget(arr, target);
        System.out.println(result);
        sc.close();
    }
}