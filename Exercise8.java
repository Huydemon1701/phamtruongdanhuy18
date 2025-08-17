package Lec3_Exercise;
import java.util.Scanner;
public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 words (separated by space):");
        for (int i = 1; i <= 5; i++) {
            String word = scanner.next(); 
            System.out.println("Word " + i + ": " + word);
        }
        scanner.close();
    }
    
}
