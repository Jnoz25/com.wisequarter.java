package day19_arrays;

import java.util.Scanner;

public class C06_KullaniciArrayOlusturma {

    public static void main(String[] args) {


    arrayOlustur();

    }


    public static int[] arrayOlustur(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen arrayin kac elemanlı olacagini giriniz : " );
        int lenght = scanner.nextInt();


        int[] arr = new int[lenght];

        for (int i = 0; i < arr.length; i++) {

            System.out.println(i + ". indexteki eleman icin bir deger giriniz...");


            arr[i] = scanner.nextInt();
        }

        return arr;

    }
}
