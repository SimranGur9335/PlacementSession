package Basic;

import java.util.Scanner;

public class SwitchStatment {
    public static void main(String[] args) {
        System.out.println("1.Paratha 2.Chai 3.Sandwich 4. HWa Khana Hai");

        Scanner sc=new Scanner(System.in);

        int choice=sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Lo ji paratha");
                break;
            case 2:
                System.out.println("Lo ji Chai");
                break;
            case 3:
                System.out.println("Lo ji Sandwich");
                break;
            case 4:
                System.out.println("Lo ji Huwa Khanna hai");
                break;
            default:
                throw new AssertionError();
        }
    }
}
