package BasicsOfSowtwareCodeDevelopment.LinearPrograms;
//Find value ((b+sqrt(b^2+4ac)/2a) - a^3*c+b^-2
import java.util.Scanner;

public class TestTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value 'a'");
        double a = sc.nextDouble();
        System.out.println("Enter the second value 'b'");
        double b = sc.nextDouble();
        System.out.println("Enter the third value");
        double c = sc.nextDouble();
        double answer = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println("Answer: " + answer);
        sc.close();
    }
}
