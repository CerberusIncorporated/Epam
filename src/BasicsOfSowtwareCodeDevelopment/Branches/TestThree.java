package BasicsOfSowtwareCodeDevelopment.Branches;
//Three points are given: A (x1;y1), B (x2;y2) and C (x3;y3).
// Determine whether they will be located on the same straight line.
import java.util.Scanner;

public class TestThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1");
        int x1 = sc.nextInt();
        System.out.println("Enter y1");
        int y1 = sc.nextInt();
        System.out.println("Enter x2");
        int x2 = sc.nextInt();
        System.out.println("Enter y2");
        int y2 = sc.nextInt();
        System.out.println("Enter x3");
        int x3 = sc.nextInt();
        System.out.println("Enter y3");
        int y3 = sc.nextInt();
        if (x1 * y2 + x3 * y1 + x2 * y3 - x3 * y2-x2 * y1-x1 * y3==0){
            System.out.println("Be located on the same straight line.");
        }
        else{
            System.out.println("Not be located on the same straight line.");
        }


    }
}
