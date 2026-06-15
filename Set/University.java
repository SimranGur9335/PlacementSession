package Set;

import java.util.HashSet;
import java.util.Set;

public class University {
    private final Set<Student> students = new HashSet<>();

    public void addStudent(Student student) {
        if (student == null || student.getEmail() == null || student.getEmail().isEmpty()) {
            System.out.println("Email cannot be null or empty.");
            return;
        }

        if (students.add(student)) {
            System.out.println("Student added: " + student);
        } else {
            System.out.println("Student already exists: " + student);
        }
    }

    public void registermultipleStudents(Student[] students) {
        for (Student student : students) {
            addStudent(student);
        }
    }

    public void removeStudent(String email) {
        if (email == null || email.isEmpty()) {
            System.out.println("Email cannot be null or empty.");
            return;
        }

        Student studentToRemove = null;

        for (Student student : students) {
            if (email.equals(student.getEmail())) {
                studentToRemove = student;
                break;
            }
        }

        if (studentToRemove != null) {
            students.remove(studentToRemove);
            System.out.println("Student removed: " + studentToRemove);
        } else {
            System.out.println("Student with email " + email + " not found.");
        }
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students registered.");
            return;
        }

        for (Student student : students) {
            System.out.println(student);
        }
    }

    public boolean isEmpty() {
        return students.isEmpty();
    }

    public void totalStudents() {
        System.out.println("Total Students: " + students.size());
    }

    public void clearStudents() {
        students.clear();
        System.out.println("All students removed.");
    }

    public void searchStudent(String email) {
        if (email == null || email.isEmpty()) {
            System.out.println("Email cannot be null or empty.");
            return;
        }

        for (Student student : students) {
            if (email.equals(student.getEmail())) {
                System.out.println("Student found: " + student);
                return;
            }
        }

        System.out.println("Student with email " + email + " not found.");
    }
}