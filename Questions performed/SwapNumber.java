import java.util.Scanner;

class SwapNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number:");
        int a = sc.nextInt();

        System.out.println("Enter Second Number:");
        int b = sc.nextInt();

        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}