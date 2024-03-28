package day12_stringManipulations_forLoop;

import java.util.Scanner;

public class C08_ForAradakiSayilariYazdirma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen baslangıc degerini giriniz");
        int baslangic = scanner.nextInt();

        System.out.println("Lütfen bitis degerini giriniz");
        int bitis = scanner.nextInt();

        if (bitis<baslangic) {
            System.out.println("Bitis degeri baslangictann kücük olamaz");

        }else {
            for (int i = baslangic; i <=bitis ; i++) {

                if (i%7 == 0){
                    System.out.print(i+ "   ");

            }


        }

        }

    }

}
