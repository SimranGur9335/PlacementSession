package Basic;
import java.util.Scanner;

public class Area{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Student Name: ");
        String name=sc.next();

        System.out.println("Enter Marks of Student of Sub1 (out of 100)");
        int mark1=sc.nextInt();
        System.out.println("Enter Marks of Student of Sub2 (out of 100)");
        int mark2=sc.nextInt();
        System.out.println("Enter Marks of Student of Sub3 (out of 100)");
        int mark3=sc.nextInt();

        System.out.println("Name of Student: "+name);

        double percentage = ((mark1 + mark2 + mark3) / 3.0);
        System.out.println("Percentage: " + percentage);

        System.out.println("Enter Radius: ");
        int r=sc.nextInt();
        System.out.println("Area of Circle: "+ 3.14*r*r);
    }
}