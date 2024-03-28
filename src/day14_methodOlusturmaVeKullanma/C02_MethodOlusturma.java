package day14_methodOlusturmaVeKullanma;

public class C02_MethodOlusturma {
    public static void main(String[] args) {

        // verilen iki sayıdan büyük olanı yazdıran bir method olusturun
        // eger sayılar esitse "esit sayılarda büyük olan yoktur"

        buyukOlaniYazdir(7,8);
        buyukOlaniYazdir(7,5);
        buyukOlaniYazdir(5,5);



    }

    //method class içinde ama diger mothodların dısında olusturulmalı

    public static void buyukOlaniYazdir(int sayi1, int sayi2){

        if (sayi1>sayi2){

            System.out.println("Sayilardan büyük olan " + sayi1);
        } else if (sayi2>sayi1) {

            System.out.println("Sayilardan büyük olan  "+  sayi2);
        }else {
            System.out.println("Esit sayılarda büyük olan yoktur");
        }


    }
}
