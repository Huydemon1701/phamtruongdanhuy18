package Lec3_Exercise;
import java.util.Scanner;
public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        System.out.println("Your full name is: " + fullName);

        scanner.close();
    }
}
