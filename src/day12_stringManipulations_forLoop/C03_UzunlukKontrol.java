package day12_stringManipulations_forLoop;

import java.util.Scanner;

public class C03_UzunlukKontrol {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Lütfen bir metin giriniz");

        String metin = scanner.nextLine();

        if (metin.length() %2 == 0){

            System.out.println( metin.substring(0,metin.length()/2) +
                    ":)" +
                    metin.substring(metin.length()/2)
            );

        } else {

            System.out.println(metin.substring(0,metin.length()/2)+
                    ":(" +
                    metin.substring(metin.length()/2+1)
                    );


        }


    }
}
