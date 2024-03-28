package day13_forLoop_nestedForLoop;

import java.util.Scanner;

public class C03_FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir sayı giriniz");

        int sayi = scanner.nextInt();

        for (int i = 1; i < sayi; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(" fizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print(" fizz ");
            } else if (i % 5 == 0) {
                System.out.print(" buzz " );
            } else {
                System.out.print(i + " ");
            }
        }
    }
}