package day14_methodOlusturmaVeKullanma;

import java.util.Scanner;

public class C06_IsimDuzenle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Isminizi giriniz ");
        String isim = scanner.nextLine();

        System.out.println("Lutfen soyisminizi giriniz ");
        String soyisim = scanner.nextLine();

        System.out.println(isimDuzenle(isim, soyisim));


    }
    public static String isimDuzenle(String isim,String soyisim){

        String duzenlenmisIsim = isim.substring(0,1).toUpperCase()+
                                 isim.substring(1).toLowerCase() +
                                 " " +
                                 soyisim.substring(0,1).toUpperCase()+
                                 soyisim.substring(1).toLowerCase();

        return duzenlenmisIsim;


    }
}
