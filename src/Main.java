import java.util.Scanner;

public class Main {
    String studentId = "";
    String firstName = "";
    String lastName = "";
    String course = "";
    String section = "";

    int midtermExamScore = 0;
    int finalExamScore = 0;
    int projectScore = 0;
    int attendanceScore = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        System.out.print("Enter Section: ");
        String section = scanner.nextLine();

        System.out.println("\nSTUDENT INFORMATION");
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + firstName + " " + lastName);
        System.out.println("Course: " + course);
        System.out.println("Section: " + section);

        System.out.print("\nEnter Midterm Exam Score: ");
        int midtermScore = scanner.nextInt();

        System.out.print("Enter Final Exam Score: ");
        int finalScore = scanner.nextInt();

        System.out.print("Enter Project Score: ");
        int projectScore = scanner.nextInt();

        System.out.print("Enter Attendance Percentage: ");
        int attendancePercentage = scanner.nextInt();

        double totalScore = midtermScore + finalScore + projectScore + attendancePercentage;
        double averageScore = totalScore / 400 * 100;

        String remarks = (averageScore < 75) ? "FAILED" : "PASSED";

        System.out.println("\nSTUDENT SCORE");
        System.out.println("Midterm Exam Score: " + midtermScore);
        System.out.println("Final Exam Score: " + finalScore);
        System.out.println("Project Score: " + projectScore);
        System.out.println("Attendance Percentage: " + attendancePercentage);

        System.out.printf("\nAVERAGE SCORE: %.2f\n", averageScore);
        System.out.println("REMARKS: " + remarks);

        scanner.close();
    }
}