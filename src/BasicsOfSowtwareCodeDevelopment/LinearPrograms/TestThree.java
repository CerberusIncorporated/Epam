package BasicsOfSowtwareCodeDevelopment.LinearPrograms;
//Find value ((sin x + cos y) / (cos x - sin y)) * tg xy
import java.util.Scanner;

public class TestThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x");
        double x = sc.nextDouble();
        System.out.println("Enter y");
        double y = sc.nextDouble();
        double answer = ((Math.sin(x) + Math.cos(y))/(Math.cos(x)-Math.sin(y)))*Math.tan(x*y);
        System.out.println("AnswerL "+answer);
        sc.close();
    }
}
