package BasicsOfSowtwareCodeDevelopment.Branches;
//Find max{min(a,b), min(c,d)}
import java.util.Scanner;

public class TestTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        double a = sc.nextDouble();
        System.out.println("Enter b");
        double b = sc.nextDouble();
        System.out.println("Enter c");
        double c = sc.nextDouble();
        System.out.println("Enter d");
        double d = sc.nextDouble();
        System.out.println(Math.max(Math.max(a,b), Math.max(c,d)));
    }
}
