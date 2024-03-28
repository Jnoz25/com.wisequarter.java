package day22_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ListMethodlari {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(); // Type argument cannot be of primitive type
        sayilar.add(10);
        sayilar.add(7);
        sayilar.add(9);
        System.out.println(sayilar);


        List<Integer> list = new ArrayList<>(Arrays.asList(3,6,8,1,3,5,6));
        System.out.println(list);

        sayilar.add(1,5);

        System.out.println("yeni eklenmiş sayilar listesi : "+sayilar);

        sayilar.addAll(list);
        System.out.println("sayılar listesine list'i ekledik" + sayilar);

        sayilar.addAll(2,list);

        System.out.println(sayilar);


    }
}
