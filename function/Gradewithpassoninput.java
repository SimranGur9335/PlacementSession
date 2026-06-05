
import java.util.Scanner;

public class Gradewithpassoninput {

    Scanner sc = new Scanner(System.in);

    public int TakeInput() {
        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter Marks of Subject " + i + ": ");
            int mark = sc.nextInt();
            sum += mark;
        }
        return sum;
    }

    public double percentage(int sum) {
        double percentageofsub = sum / 5.0;
        return percentageofsub;
    }

    public void grade(double percentage) {
        if (percentage >= 90) {
            System.out.println("Grade A");
        } else if (percentage >= 80) {
            System.out.println("Grade B");
        } else if (percentage >= 70) {
            System.out.println("Grade C");
        } else if (percentage >= 60) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {

        Gradewithpassoninput obj = new Gradewithpassoninput();
        int sum = obj.TakeInput();
        System.out.println("Total Marks: " + sum);
        double percentage = obj.percentage(sum);
        System.out.println("Percentage: " + percentage);
        obj.grade(percentage);
    }
}
