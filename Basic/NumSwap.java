package Basic;

import java.util.Scanner;

public class NumSwap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        System.out.println("Enter  Number With Third Variable");
        int number1=sc.nextInt();
        int number2=sc.nextInt();

        int temp=0;

        temp=number1;
        number1=number2;
        number2=temp;

        System.out.println("After Swap With Third");

        System.out.println("Number after Swap");
        System.out.println("Num1:"+number1);
        System.out.println("Num2:"+number2);


        System.out.println("Enter First Number: ");
        
        int num1=sc.nextInt();
        System.out.println("Enter Second Number: ");
        int num2=sc.nextInt();

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After Swap");
        System.out.println("Num1 "+ num1);
        System.out.println("Num2 "+ num2);
    }
}
