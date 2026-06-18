import java.util.Scanner;

public class Employee {

    static void displayEmployees(String[] employee) {
        System.out.println("Employee Names:");
        for (String name : employee) {
            System.out.println(name);
        }
    }

    static void searchByFirstName(String[] employee, String firstName) {
        for (String name : employee) {
            if (name.startsWith(firstName)) {
                System.out.println("Found: " + name);
            }
        }
    }

    static void searchByLastName(String[] employee, String lastName) {
        for (String name : employee) {
            if (name.endsWith(lastName)) {
                System.out.println("Found: " + name);
            }
        }
    }

    static void countEmployees(String[] employee) {
        System.out.println("Total Employees: " + employee.length);
    }

    static void longestName(String[] employee) {
        String longest = employee[0];

        for (String name : employee) {
            if (name.length() > longest.length()) {
                longest = name;
            }
        }

        System.out.println("Longest Name: " + longest);
    }

    static void convertToUpperCase(String[] employee) {
        System.out.println("Employee Names in Upper Case:");
        for (String name : employee) {
            System.out.println(name.toUpperCase());
        }
    }

    public static void main(String[] args) {

        String[] employee = {
            "Shlok Oberoi",
            "Rohit Sharma",
            "Virat Kohli",
            "Aman Singh"
        };

        Scanner sc = new Scanner(System.in);

        displayEmployees(employee);

        System.out.print("\nEnter Employee First Name: ");
        String firstName = sc.next();
        searchByFirstName(employee, firstName);

        System.out.print("\nEnter Employee Last Name: ");
        String lastName = sc.next();
        searchByLastName(employee, lastName);

        countEmployees(employee);

        longestName(employee);

        convertToUpperCase(employee);

        sc.close();
    }
}