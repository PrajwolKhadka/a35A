
    import java.util.Scanner;

public class hello15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double breadth = scanner.nextDouble();
        
        double area = length * breadth;
        int areaInt = (int) area;
System.out.println("Area of rectangle (type casted to int): " + areaInt);
}
}

