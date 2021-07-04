package BasicsOfSowtwareCodeDevelopment.Branches;

import java.util.Scanner;

//          x^3 - 3x +9 , if x <= 3
// F(x) = {
//          1/(x^3 +6) , if x > 3
public class TestFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x");
        int x = sc.nextInt();
        double f;
        if (x < 3 || x == 3){
            f = Math.sqrt(x) - 3 * x + 9;
        }
        else {
            f = 1 / (Math.sqrt(x) + 6);
        }
        System.out.println("F(x) = " + f);
    }
}
