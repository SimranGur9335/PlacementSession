import java.util.Scanner;
class SortedArray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array Elements:");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        boolean sorted = true;
        for(int i = 0; i < n - 1; i++)
        {
            if(arr[i] > arr[i + 1])
            {
                sorted = false;
                break;
            }
        }
        if(sorted)
        {
            System.out.println("Array is Sorted in Ascending Order");
        }
        else
        {
            System.out.println("Array is Not Sorted");
        }
    }
}
