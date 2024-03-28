package day09_switchStatement_StringManipulations;

import java.util.Scanner;

public class C03_SwitchISTQB {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen ISTQB kısaltmasında anlamını öğrenmek istediğiniz harfi girin: ");
        char harf = scanner.next().charAt(0);

        String anlam = "";
        switch(Character.toUpperCase(harf)) {
            case 'I':
                anlam = "International";
                break;
            case 'S':
                anlam = "Software";
                break;
            case 'T':
                anlam = "Testing";
                break;
            case 'Q':
                anlam = "Qualifications";
                break;
            case 'B':
                anlam = "Board";
                break;
            default:
                anlam = "Belirtilen harfin ISTQB kısaltmasında bir anlamı bulunmamaktadır.";
        }

        System.out.println("Girilen harfin ISTQB kısaltmasındaki anlamı: " + anlam);


    }
}


