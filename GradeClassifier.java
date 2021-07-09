import java.util.Scanner;
public class GradeClassifier
{
    public static void main(String[] args) {
        titleString();
        int examMark = getMark();
        gradeMessage(examGrade(examMark));
    }

    public static void titleString() {
        // Print Title
        System.out.println("Grade Classifier");
	System.out.println("****************");
    }

   
    public static int getMark() {
        // Declare and create a Scanner to read input values
        Scanner in = new Scanner(System.in);
        System.out.println("");
        System.out.print("Enter exam mark :> ");
        int mark = in.nextInt();
        return mark;
    }

    public static String examGrade(int mark) {
        // Print out grade
        String grade;
        if (mark <= 100 && mark >=70) {
            grade = "A";
        } else if (mark <= 69 && mark >= 60) {
            grade = "B";
        } else if (mark <= 59 && mark >= 50) {
            grade = "C";
        } else if (mark <= 49 && mark >= 40) {
            grade = "D";
        } else {
            grade = "F";
        }
        return grade;
    }

  
     public static void gradeMessage(String result) {
         // Compute if grade leads to pass or fail
         String message;
         if (result == "F") {
             System.out.println("Fail");
         } else {
             System.out.println("Congratulations, you are awarded a Grade " + result + " Pass");
         }
     }
}  

