package day10_StringManipulations;

import java.util.Scanner;

public class C03_Contains {
    public static void main(String[] args) {

        //kullanıcıdan bir metin isteyin metin
        // "ev" içeriyorsa "Home sweet home",
        // "is" içeriyorsa "çalışmak çok güzel"
        // ikisini de içeriyorsa "hayatta denge cok güzeldir"
        // ikisini de içermiyorsa "tembellik güzel degil" yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir metin yazınız");
        String metin = scanner.nextLine();



        if (metin.contains("ev") && metin.contains("is")) {
            System.out.println( "Hayatta denge çok güzeldir");
        } else if (metin.contains("ev")) {
            System.out.println("Home sweet home");
        } else if (metin.contains("is")) {
            System.out.println("Çalışmak çok güzeldir");
        } else {
            System.out.println("Tembellik güzel değil");
        }

    }
}
