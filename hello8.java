import java.util.Scanner;

public class hello8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principal");
        double  p =sc.nextDouble();
        System.out.println("Enter Time");
        double t=sc.nextInt();
        System.out.println("Enter Rate");
        double  r=sc.nextDouble();
        System.out.println("SI= "+ ((p*t*r)/100));
        sc.close();
    }
}
