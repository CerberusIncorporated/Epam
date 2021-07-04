package BasicsOfSowtwareCodeDevelopment.Branches;
// Given 2 the angle of the triangle in degrees. Determine whether there is such a triangle, if so, a rectangular one?
import java.util.Scanner;

public class TestOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value:");
        int a = sc.nextInt();
        System.out.println("Enter the second value:");
        int b = sc.nextInt();
        if(a == 90 || b == 90 || a + b == 90){
            System.out.println("Triangle is exist and it rectangular.");
        }
        else if(a + b > 180){
            System.out.println("Triangle is not exist.");
        }
        else{
            System.out.println("Triangle is exist.");
        }
    }
}
