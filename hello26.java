import java.util.Scanner;

public class hello26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Select shape:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");
        System.out.println("4. Triangle");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        
        double area;
        switch (choice) {
            case 1:
                System.out.print("Enter radius of circle: ");
                double radius = scanner.nextDouble();
                area = Math.PI * radius * radius;
                break;
            case 2:
                System.out.print("Enter length of rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter width of rectangle: ");
                double width = scanner.nextDouble();
                area = length * width;
                break;
            case 3:
                System.out.print("Enter side length of square: ");
                double side = scanner.nextDouble();
                area = side * side;
                break;
            case 4:
                System.out.print("Enter base of triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter height of triangle: ");
                double height = scanner.nextDouble();
                area = 0.5 * base * height;
                break;
            default:
                System.out.println("Invalid choice entered.");
                scanner.close();
                return;
        }
        
        System.out.println("Area: " + area);
        
        scanner.close();
    }
}
