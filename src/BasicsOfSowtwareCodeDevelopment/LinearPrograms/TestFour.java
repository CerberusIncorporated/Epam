package BasicsOfSowtwareCodeDevelopment.LinearPrograms;
// A real number R of the form nnn.ddd (three digital digits in fractional and integer parts). Swap
// the fractional and integer parts of the number and output the resulting value of the number.
import java.util.Locale;
import java.util.Scanner;

public class TestFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        System.out.println("Enter a fractional number to change the fractional and integer parts");
        double R = sc.nextDouble();
        double answer = (R * 1000) % 1000 + (int) R / 1000.0;
        System.out.println("Answer: " + answer);
        sc.close();
    }
}
