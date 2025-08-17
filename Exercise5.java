package Lec3_Exercise;
import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a boolean value (true/false): ");
        boolean value = scanner.nextBoolean();
        if (value) {
            System.out.println("You entered true.");
        } else {
            System.out.println("You entered false.");
        }
        scanner.close();
    }
}
