import java.util.Scanner;
public class hello10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter age: ");
        int age= sc.nextInt();
        String result = (age >= 18) ? "You are eligible to vote" : "You are not eligible to vote";
        System.out.println(result);
        sc.close();
    }
}
