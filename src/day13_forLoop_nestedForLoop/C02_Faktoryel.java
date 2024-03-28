package day13_forLoop_nestedForLoop;

import java.util.Scanner;

public class C02_Faktoryel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 14den küçük bir pozitif tam sayı giriinz");
        int sayi = scanner.nextInt();

        int faktoryel = 1;
        System.out.println(sayi+ " ! = ");

        if (sayi>=14){
            System.out.println("Hatalı sayı girdiniz");
        }else {

            for (int i = sayi; i >= 1 ; i--) {

                faktoryel *= i;
                if (i != 1) {
                    System.out.print(i + " * ");
                }else {
                    System.out.print(i+" " + " = ");
                }

            }
            System.out.print( faktoryel + "  Faktoryeldir ");

        }


    }
}



