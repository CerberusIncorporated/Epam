package BasicsOfSowtwareCodeDevelopment.LinearPrograms;
// The number of seconds is given. Print hours, minutes, seconds
import java.util.Scanner;

public class TestFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of seconds");
        long seconds = sc.nextInt();
        long hour,min,sec;
        hour = seconds / 3600;
        min = seconds / 60 % 60;
        sec = seconds % 60;
        System.out.println(hour+"ч "+min+"мин "+sec+"c.");
        sc.close();
    }
}
