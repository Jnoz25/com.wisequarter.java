package day15_methodOverloading_whileLoop;

import java.util.Scanner;

public class C04_WhileLoop {
    public static void main(String[] args) {

        // Kullanicidan toplamanmak üzere tam sayılar isteyin
        // Sayıların toplamı 500 ve ya daha fazla olursa
        // sayi istemeyi durdurup , toplamı yazdır.

        Scanner scanner = new Scanner(System.in);

        int sayi = 0;
        int toplam = 0;

        while (toplam<500){

            System.out.println("Toplanmak üzere tam sayı giriniz");
            sayi = scanner.nextInt();

            toplam += sayi;

        }

        System.out.println("Girdiginiz sayıların toplamı " + toplam);

    }
}
