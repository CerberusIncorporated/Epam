package BasicsOfSowtwareCodeDevelopment.LinearPrograms;
//Find the function value z = (( a - 3 ) * b / 2 ) + c
import java.util.Scanner;

public class TestOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("z = (( a - 3 ) * b / 2 ) + c");
        System.out.println("Enter the first value");
        double a = sc.nextDouble();
        System.out.println("Enter the second value");
        double b = sc.nextDouble();
        System.out.println("Enter the third value");
        double c = sc.nextDouble();
        double answer = ((a-3)*b/2)+c;
        System.out.println("Answer: " + answer);
        sc.close();
    }

}
