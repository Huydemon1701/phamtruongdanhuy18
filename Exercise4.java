package Lec3_Exercise;
import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
         Scanner scanner  = new Scanner(System.in);
        System.out.print("Nhap float1: ");
        double num1 = scanner.nextDouble();
        System.out.print("Nhap float2: ");
        double num2 = scanner.nextDouble();
        double avg = (num1 + num2) / 2;
        System.out.println("Average = " + avg);
        scanner.close();
    }
}
