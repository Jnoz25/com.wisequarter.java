package day10_StringManipulations;

import java.util.Scanner;

public class C05_Soru {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen mailinizi girin");
        String mail = scanner.nextLine();

        if (!mail.contains("@")) {
            System.out.println("Geçersiz mail");
        } else if (!mail.endsWith("@gmail.com")) {
            System.out.println("Mailde yazım hatası var");
        } else {
            System.out.println("Mail gmail olmalı");
        }


    }
}

