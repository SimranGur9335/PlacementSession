import java.util.Scanner;

public class Countdigit {
    static int countDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return 1 + countDigits(num / 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = countDigits(n);
        System.out.println("Number of digits in " + n + " is: " + count);
    }
}
