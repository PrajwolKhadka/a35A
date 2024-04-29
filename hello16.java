import java.util.Scanner;

public class hello16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter marks of subject 1: ");
        int subject1 = scanner.nextInt();
        System.out.print("Enter marks of subject 2: ");
        int subject2 = scanner.nextInt();
        System.out.print("Enter marks of subject 3: ");
        int subject3 = scanner.nextInt();
        System.out.print("Enter marks of subject 4: ");
        int subject4 = scanner.nextInt();
        
        int totalMarks = subject1 + subject2 + subject3 + subject4;
        double percentage = (totalMarks / 4.0);
        
        String result = (percentage >= 70) ? "First Class" :
        (percentage >= 60) ? "Upper Second Class" :
        (percentage >= 50) ? "Second Class" :
        (percentage >= 40) ? "Third Class" : "Fail";
        
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage);
        System.out.println("Result: " + result);
        scanner.close();
    }
}
