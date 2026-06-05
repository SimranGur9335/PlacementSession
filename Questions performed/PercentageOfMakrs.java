import java.util.Scanner;

class Student
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Enter Marks of 5 Subjects:");
        int marks1 = sc.nextInt();
        int marks2 = sc.nextInt();
        int marks3 = sc.nextInt();
        int marks4 = sc.nextInt();
        int marks5 = sc.nextInt();

        int total = marks1 + marks2 + marks3 + marks4 + marks5;
        double percentage = total / 5.0;

        System.out.println("Name = " + name);
        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage + "%");
    }
}
