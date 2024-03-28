package day13_forLoop_nestedForLoop;

import java.util.Scanner;

public class C05_StringiTerseCevirme {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz");
        String metin = scanner.nextLine();
        
        String tersmetin = "";

        for (int i = metin.length()-1 ; i >= 0 ; i--) {

            tersmetin += metin.charAt(i);

            
        }

        System.out.println(tersmetin);
        
        
    }
}
