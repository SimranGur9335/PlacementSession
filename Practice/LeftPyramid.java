package Practice;
import java.util.Scanner;
class LeftPyramid
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int rows = sc.nextInt();
        for(int chinki = 1; chinki <= rows; chinki++)
        {
            for(int minki = 1; minki <= chinki; minki++)
            {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
