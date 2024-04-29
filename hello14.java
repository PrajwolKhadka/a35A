import java.util.Scanner;

public class hello14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side length of the square: ");
        double side = scanner.nextDouble();

        double areaOfSquare = side * side;
        double perimeterOfSquare = 4 * side;
        System.out.println("Area of Square: " + areaOfSquare);
        System.out.println("Perimeter of Square: " + perimeterOfSquare);

        double principal = 1000; 
        double time = 2; 
        double rate = 5; 
        double simpleInterest = (principal * time * rate) / 100;
        System.out.println("Simple Interest: " + simpleInterest);

        double base = 5; 
        double height = 3; 
        double areaOfTriangle = 0.5 * base * height;
        System.out.println("Area of Triangle: " + areaOfTriangle);

        double volumeOfCube = side * side * side;
        System.out.println("Volume of Cube: " + volumeOfCube);
        double length = 6;
        double heightCuboid = 2;
        double width= 3;
        double volumeOfCuboid = length * width * heightCuboid;
        System.out.println("Volume of Cuboid: " + volumeOfCuboid);
        scanner.close();
    }
}

