

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        String employee[]={
            "Shlok Oberoi",
            "Rohit Sharma",
            "Virat Kohli",
            "Aman Singh"
        };

        System.out.println("Employee Name:");
        for(String name:employee){
            System.out.println(name);
        }

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee First Name");
        String firstName=sc.next();

        for(String name:employee){
            if(name.startsWith(firstName)){
                System.out.println("Found:"+name);
            }
            
        }
        System.out.println("Enter Employee Last Name");
        String lastName=sc.next();

        for(String name :employee){
            if(name.endsWith(lastName)){
                System.out.println("Found:"+name);
            }
        }
        System.out.println("Total Employee: "+employee.length);

        String longestName=employee[0];

        for(String name:employee){
            if(longestName.length()<name.length()){
                longestName=name;
            }
        }

        System.out.println("Longest Name:"+longestName);
        System.out.println("Employee Name in Upper Case:");
        for(String name:employee){
            System.out.println(name.toUpperCase());
        }
    }
}
