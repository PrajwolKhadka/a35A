import java.util.Scanner;

public class hello12{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        int sum = num1 + num2;
        System.out.println(sum);
        int product = num1 * num2;
        System.out.println(product);
        double division =  sum / product;
        
        System.out.println("Division of sum and product: " + division);
        scanner.close();
    }
}
