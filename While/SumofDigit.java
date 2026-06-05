import java.util.Scanner;

public class SumofDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n=sc.nextInt();
        int sum=0;
        int rem=0;
        while (n!=0) {
            rem=n%10;
            sum+=rem;
            n=n/10;
        }
        System.out.println("Sum of Digit: "+sum);

    }
}
