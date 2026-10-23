public class Main {

    // This method displays all the information of a student
    public static void displayStudentDetails(Student student) {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + student.getName());
        System.out.println("ID: " + student.getiD());
        System.out.println("Age: " + student.getAge());
        System.out.println("Course: " + student.getCourse());
        System.out.println("Email: " + student.getEmail());
        System.out.println("CGPA: " + student.getcGPA());
        System.out.println("Years of Study: "
                           + student.getYearsOfStudy());
    }

    // This method checks the student's academic standing based on their CGPA
    public static void checkAcademicStanding(Student student) {

        // Check the CGPA and display the result
        if (student.getcGPA() >= 3.50) {
            System.out.println(student.getName()
                               + ": Excellent academic standing.");
        } else if (student.getcGPA() >= 2.00) {
            System.out.println(student.getName()
                               + ": Satisfactory academic standing.");
        } else {
            System.out.println(student.getName()
                               + ": Needs academic improvement.");
        }
    }

public static void main(String[] args) {

    // Create two students
    Student s1 = new Student("Ali", "S101", 20, "BCS", "ali@email.com", 3.50, 2)

    Student s2 = new Student("Siti", "S102", 21, "BIT", "siti@email.com",3.20, 3)

    // Display both students' details
    System.out.println("=== Student Management System ===");
    displayStudentDetails(s1);
    displayStudentDetails(s2);

    // Change Ali's CGPA using the setter
    s1.setCGPA(3.80);

    // Display Ali's updated CGPA using the getter
    System.out.println("\nAli's updated CGPA: " + s1.getcGPA());

    // Use a for loop to check both students' academic standing
    System.out.println("\n=== Academic Standing ===");

    for (int i = 1; i <= 2; i++) {
        if (i == 1) {
            checkAcademicStanding(s1);
        } else {
            checkAcademicStanding(s2);
        }
    }

    // Set the first menu choice
    int choice = 1;

    // Repeat the menu tasks while the choice is not 4
    while (choice != 4) {

        // Use switch to select a task
        switch (choice) {

            case 1:
                // Display both students' details
                System.out.println("\n=== Student Details ===");
                displayStudentDetails(s1);
                displayStudentDetails(s2);
                choice = 2;
                break;

            case 2:
                // Change Siti's course using the setter
                System.out.println("\n=== Update Student Course ===");
                s2.setCourse("BCS");

                // Display Siti's new course using the getter
                System.out.println("Siti's new course: "
                                   + s2.getCourse());
                choice = 3;
                break;

            case 3:
                // Check Ali's updated academic standing
                System.out.println("\n=== Check Academic Standing ===");
                checkAcademicStanding(s1);
                choice = 4;
                break;

            case 4:
                // End the program
                System.out.println("Program completed.");
                break;

            default:
                System.out.println("Invalid choice.");
                choice = 4;
        }
    }
}
}