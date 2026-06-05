import java.util.Scanner;

class LargestArray
{
    static int largest(int arr[])
    {
        int max = arr[0];

        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " Elements:");

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int result = largest(arr);

        System.out.println("Largest Element = " + result);
    }
} 