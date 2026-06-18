package Set;

public class App {
    public static void main(String[] args) {
        University university = new University();
        Student[] students = {
                new Student("Java", "sai@gmail.com", "Aarav", "S101"),
                new Student("Python", "vivaan@gmail.com", "Vivaan", "S102"),
                new Student("C++", "aditya@gmail.com", "Aditya", "S103"),
                new Student("Java", "vihaan@gmail.com", "Vihaan", "S104"),
                new Student("Python", "arjun@gmail.com", "Arjun", "S105"),
                new Student("C++", "sai@gmail.com", "Sai", "S106"),
                new Student("Java", "krishna@gmail.com", "Krishna", "S107"),
                new Student("Python", "rohan@gmail.com", "Rohan", "S108"),
                new Student("C++", "rahul@gmail.com", "Rahul", "S109"),
                new Student("Java", "priya@gmail.com", "Priya", "S110"),
                new Student("Python", "ananya@gmail.com", "Ananya", "S111"),
                new Student("C++", "sai@gmail.com", "Kavya", "S112"),
                new Student("Java", "isha@gmail.com", "Isha", "S113"),
                new Student("Python", "neha@gmail.com", "Neha", "S114"),
                new Student("C++", "aman@gmail.com", "Aman", "S115"),
                new Student("Python", "vivaan@gmail.com", "Vivaan", "S102"),
                new Student("C++", "aman@gmail.com", "Aman", "S115"),
                new Student("Java", "krishna@gmail.com", "Krishna", "S107")
        };
        university.registermultipleStudents(students);

        System.out.println("\nRegistered Students:");
        university.displayStudents();
        System.out.println("\nRemoving student with email sai@gmail.com:");
        university.removeStudent("sai@gmail.com");
        System.out.println("\nStudents after removal:");
        university.displayStudents();

        System.out.println("\nSearching for student with email aman@gmail.com:");
        university.searchStudent("aman@gmail.com");
    }
}
