import java.util.Scanner;

public class hello22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an alphabet: ");
        char ch = scanner.next().toUpperCase().charAt(0);
        
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
        scanner.close();
    }
}
