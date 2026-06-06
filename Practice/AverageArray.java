package Practice;
import java.util.Scanner;

class AverageArray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        int sum = 0;
        double average;

        System.out.println("Enter 5 Numbers:");

        for(int i = 0; i < 5; i++)
        {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        average = (double)sum / 5;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}