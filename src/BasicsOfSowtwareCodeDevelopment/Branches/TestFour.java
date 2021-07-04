package BasicsOfSowtwareCodeDevelopment.Branches;
//The dimensions A, B of the rectangular hole and the dimensions X, Y, Z of the brick are given.
//Determine whether the brick will pass through the hole.
import java.util.Scanner;

public class TestFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A");
        int a = sc.nextInt();
        System.out.println("Enter B");
        int b = sc.nextInt();
        System.out.println("Enter x");
        int x = sc.nextInt();
        System.out.println("Enter y");
        int y = sc.nextInt();
        System.out.println("Enter z");
        int z = sc.nextInt();
        if(((a>=x)&&(b>=y))
        || ((a>=y)&&(b>=x))
        || ((a>=x)&&(b>=z))
        || ((a>=z)&&(b>=x))
        || ((a>=y)&&(b>=z))
        || ((a>=z)&&(b>=y))){
            System.out.println("It will pass");
        }
        else{
            System.out.println("It's not shall pass");
        }
    }
}
