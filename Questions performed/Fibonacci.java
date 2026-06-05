import java.util.Scanner;

class Fibonacci
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Terms: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        System.out.println("Fibonacci Series:");

        for(int i = 1; i <= n; i++)
        {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }
    }
}
