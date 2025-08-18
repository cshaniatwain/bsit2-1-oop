public class GradeCalculator {

    public static double calculateAverage(double... grades) {
        if (grades.length == 0) return 0.0;

        double sum = 0;
        for (double grade: grades) {
            sum += grade;
    }
        return sum/ grades. length;
    }
    public static String getLetterGrade(double average) {
        if (average >= 90) return "A";
        else if (average >= 80) return "B";
        else if (average >= 70) return "C";
        else if (average >= 60) return "D";
        else return "F";
    }
    public static void displayResult(String studentName, double average) {
        System.out.print("Student: " + studentName + ", Average: " + average);
       
    }
    public static void displayResult(String studentName, double average, String letterGrade) {
        System.out.print("Student: " + studentName + ", Average: " + average + ", Grade: " + letterGrade);
 
    }
    public static void main(String[] args) {
        String studentName = "John Smith";
        double average = calculateAverage(85.5, 92.0, 78.5, 90.0);
        String letterGrade = getLetterGrade(average);

        displayResult(studentName, average);
        System.out.println();
        displayResult(studentName, average, letterGrade);
    }
}
