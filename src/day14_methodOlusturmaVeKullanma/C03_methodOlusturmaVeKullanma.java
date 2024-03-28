package day14_methodOlusturmaVeKullanma;

public class C03_methodOlusturmaVeKullanma {

    public static void main(String[] args) {

        // verilen bir metni tersten yazdiran bir method olusturun

        terstenYazdir("Method olusturma güzel");
        terstenYazdir("1 2 3 4 5 6");
    }

    public static void terstenYazdir(String metin){
        System.out.println(" ");

        for (int i = metin.length()-1; i >=0 ; i--) {
            System.out.print(metin.charAt(i));
        }

    }
}
