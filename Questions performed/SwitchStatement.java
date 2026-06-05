import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {

        System.out.println("1. Paratha");
        System.out.println("2. Chai");
        System.out.println("3. Sandwich");
        System.out.println("4. Hawa Khani Hai");

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter your choice: ");
        int option = obj.nextInt();

        switch(option) {
            case 1:
                System.out.println("Lo ji Paratha");
                break;

            case 2:
                System.out.println("Lo ji Chai");
                break;

            case 3:
                System.out.println("Lo ji Sandwich");
                break;

            case 4:
                System.out.println("Hawa khani hai toh side me beth ja");
                break;

            default:
                System.out.println("andha hai kya bhai mere??");
        }

        obj.close();
    }
}