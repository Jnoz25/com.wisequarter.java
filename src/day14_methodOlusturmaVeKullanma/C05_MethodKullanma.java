package day14_methodOlusturmaVeKullanma;

import java.util.Scanner;

public class C05_MethodKullanma {
    public static void main(String[] args) {

        // Kullanıcıdan bir metin alın
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz ");
        String metin = scanner.nextLine();


        // kullanicinin girdigi metni tersten yazdirin

        C03_methodOlusturmaVeKullanma.terstenYazdir(metin);

        C04_Palindrome.isPalindrome(metin);

        boolean sonuc = C04_Palindrome.isPalindrome(metin);

        if (sonuc == true){

            System.out.println("Aferin sana ");
        }else {
            System.out.println("Bu nasıl metin daha güzel ");
        }

    }
}
