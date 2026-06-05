
import java.util.Scanner;

public class Guessgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Player 1 Number: ");
        int p1 = sc.nextInt();
        int p2;
        int count = 0;
        do {

            System.out.println("Enter Player 2 Number: ");
            p2 = sc.nextInt();
            count++;
            if (p1 > p2) {
                System.out.println("Please Enter Higher Number Than: " + p2);
            }  else if (p2 > p1) {
                System.out.println("Please Enter Lower Number Than: "+p2);
            }

        } while (p1 != p2);

         System.out.println("Congratulations! You guessed the number in " + count + " attempts.");
    }
}
