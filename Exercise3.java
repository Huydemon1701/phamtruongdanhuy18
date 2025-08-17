package Lec3_Exercise;
import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap so nguyen dau tien: ");
            int a = scanner.nextInt();
            
            System.out.print("Nhap so nguyen thu hai: ");
            int b = scanner.nextInt();
            
            System.out.println("Sum = " + (a + b));
        }
    }
}

