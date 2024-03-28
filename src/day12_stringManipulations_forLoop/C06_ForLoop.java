package day12_stringManipulations_forLoop;

import java.util.Scanner;

public class C06_ForLoop {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tam sayı giriniz");
        int sayi = scanner.nextInt();

        for (int i = sayi; i >= 1 ; i--) {

            System.out.print(i + "  ");

        }

    }
}
