import java.util.Scanner;

public class IT24101304Lab4Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter exam marks (out of 100) : ");
        int Exam_Marks = scanner.nextInt();
        if (Exam_Marks > 100 || Exam_Marks < 0) {
            System.out.println("Invalid input for exam marks. Terminating program.");
            return;
        }
        System.out.println("Please enter exam lab submission marks (out of 100) : ");
        int Lab_Marks = scanner.nextInt();
        if (Lab_Marks > 100 || Lab_Marks < 0) {
            System.out.println("Invalid input for lab submission marks. Terminating program.");
            return;
        }
        System.out.println("Please enter the percentage given for the exam : ");
        int Exam_Percent = scanner.nextInt();
        System.out.println("Please enter the percentage given for the lab submission : ");
        int Lab_Percent = scanner.nextInt();

        int Exam = Exam_Marks * Exam_Percent / 100;
        int Lab = Lab_Marks * Lab_Percent / 100;

        if (Lab_Percent + Exam_Percent != 100) {
            System.out.println("The Percentages must add up to 100. Terminating program.");
            return;
        }
        double Final_Marks = Exam + Lab;
        System.out.println("Final mark is : " + Final_Marks);
    }
}