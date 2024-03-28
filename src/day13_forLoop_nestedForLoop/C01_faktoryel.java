package day13_forLoop_nestedForLoop;

import java.util.Scanner;

public class C01_faktoryel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 14den küçük bir pozitif tam sayı giriinz");
        int sayi = scanner.nextInt();

        int faktoryel = 1;

        if (sayi>=14){
            System.out.println("Hatalı sayı girdiniz");
        }else {

        for (int i = sayi; i >= 1 ; i--) {

            faktoryel *= i;

        }
            System.out.print("Faktoryel  "+ faktoryel);
            
        }


    }
}


