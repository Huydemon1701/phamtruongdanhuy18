package Lec3_Exercise;
import java.util.Scanner;
public class Exercise2 {
     public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = keyboard.nextLine();
         try (Scanner scanner = new Scanner(System.in)) {
             System.out.print("Enter your age: ");
             int age = scanner.nextInt();
             
             System.out.println("Hello " + name + ", you are " + age + " years old.");
         }
    }
}
