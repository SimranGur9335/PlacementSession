package Basic;
import java.util.Scanner;

public class primecomp {
    public static void main(String[] args) {
        System.out.println("Enter Number: ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();                                                                                                                          
        boolean isprime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isprime = false;
                break;
            }
        }

        if (isprime) {
            System.out.println("Number" + num + " is Prime");
        } else {
            System.out.println("Number " + num + " not is Prime");
        }
    }
}
