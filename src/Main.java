public class Student {
    String name = "";
    int age = 0;
    String course = "";
    double grade1;
    double grade2;
    double grade3;

    public static void displayInfo(String getName, int getAge, String getCourse, double getFirstGrade, double getSecondGrade, double getThirdGrade){
        name = getName;
        age = getAge;
        course = getCourse;
        grade1 = getFirstGrade;
        grade2 = getSecondGrade;
        grade3 = getThirdGrade;

        public  void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Course: " + course);
            System.out.println("Grade 1: " + grade1);
            System.out.println("Grade 2: " + grade2);
            System.out.println("Grade 3: " + grade3);


        public double caculateAverage() {
           return (grade1 + grade2 + grade3) /3;

        public String getLtterGrade() {
            double average = calculateAverage();
            if (average >= 90) return "A";
            else if (average >= 80) return "B";
            else if (average >= 70) return "C";
            else if (average >= 60) return "D";
            else return "F";

        public boolean isPassing () {
        return calculateAverage() >= 70;

     }
}
        public void main(String[] args){
            Student student1 = new Student ("Shania", 20, "BSIT", 85,75,90);
            Student student2 = new Student ("Arnold",21, "BSComputer Science", 88,92,87);
            Student student3= new Student ("Ashley", 19, "BSIT", 75,89,90);

            Students[] students = {student1 , student2, student3);
            int passingCount = 0;

            for(Student student :students) {
            student.displayInfo();
            String grade = student.getLetterGrade();
            System.out.println("Letter Grade: " + grade);
            boolean isPassing = student.isPassing();
            System.out.println("Status: " + (isPassing ? "PASSING" : "FAILING"));
            System.out.println();

                if(isPassing) {
                passingCount++;

        }
    }
    
            System.out.println(Total of Students PASSING: + passingCount");
        }

                
