package day13_forLoop_nestedForLoop;

import java.util.Scanner;

public class C04_StringTerstenYazdirma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir string girin: ");
        String str = scanner.nextLine();


        String tersString = "  ";
        for (int i = str.length() - 1; i >= 0; i--) {
            tersString += str.charAt(i);
        }
        System.out.println("Girilen Stringin tersi: " + tersString);
    }
}