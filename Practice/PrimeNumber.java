package Practice;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        int count = 0;
        System.out.println("Divisible by:");
        for(int chinki = 1; chinki <= num; chinki++) {
            if(num % chinki == 0) {
                System.out.println(chinki);
                count++;
                
            }
        }
        if(count == 2) {
            System.out.println(num + " is a Prime Number");
        }
        if(count > 2) {
           System.out.println(num + " is Not Prime because it is also divisible by numbers other than 1 and itself.");
        }
        sc.close();
    }
}
