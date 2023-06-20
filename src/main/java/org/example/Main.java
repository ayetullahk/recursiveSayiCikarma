package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = scanner.nextInt();
        scanner.close();

        recursiveManipulation(n);
    }

    public static void recursiveManipulation(int n) {
        if (n <= 0) {
            System.out.println("Son değer: " + n);
            recursiveManipulation(n + 5);
        } else {
            System.out.println("Son değer: " + n);
            if (n <= 5) {
                return;
            }
            recursiveManipulation(n - 5);
        }
    }
}