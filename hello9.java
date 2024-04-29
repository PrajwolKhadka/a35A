import java.util.Scanner;

public class hello9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter height of the triangle: ");
        double triangleheight = scanner.nextDouble();
        double Triangle = 0.5 * base * triangleheight;
        System.out.println("Area of Triangle: " + Triangle);
        
        
        System.out.print("Enter side length of the cube: ");
        double side = scanner.nextDouble();
        double Cube = side * side * side;
        System.out.println("Volume of Cube: " + Cube);
        
        
        System.out.print("Enter length of the cuboid: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width of the cuboid: ");
        double width = scanner.nextDouble();
        System.out.print("Enter height of the cuboid: ");
        double height = scanner.nextDouble();
        double Cuboid = length * width * height;
        System.out.println("Volume of Cuboid: " + Cuboid);
        scanner.close();
    }
}
