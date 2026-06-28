import java.util.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("\n===== Student Grade Tracker =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Calculate Average");
            System.out.println("4. Highest Score");
            System.out.println("5. Lowest Score");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    int marks = sc.nextInt();

                    students.add(new Student(name, marks));
                    System.out.println("Student Added!");
                    break;

                case 2:
                    System.out.println("\nStudent List:");
                    for (Student s : students) {
                        System.out.println(s.name + " - " + s.marks);
                    }
                    break;

                case 3:
                    int total = 0;
                    for (Student s : students) {
                        total += s.marks;
                    }
                    if (!students.isEmpty()) {
                        System.out.println("Average Marks = "
                                + (double) total / students.size());
                    }
                    break;

                case 4:
                    if (!students.isEmpty()) {
                        Student highest = students.get(0);
                        for (Student s : students) {
                            if (s.marks > highest.marks) {
                                highest = s;
                            }
                        }
                        System.out.println("Highest Score: "
                                + highest.name + " - " + highest.marks);
                    }
                    break;

                case 5:
                    if (!students.isEmpty()) {
                        Student lowest = students.get(0);
                        for (Student s : students) {
                            if (s.marks < lowest.marks) {
                                lowest = s;
                            }
                        }
                        System.out.println("Lowest Score: "
                                + lowest.name + " - " + lowest.marks);
                    }
                    break;

                case 6:
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}