package day22_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_EnUzunKelime {
    public static void main(String[] args) {


        List<String> isimler = new ArrayList<>(Arrays.asList("Seher","Sumeyra","Meltem","Ramazan"));

        System.out.println(isimler);

        String enUzunKelime = isimler.get(0);

        for (int i = 0; i < isimler.size(); i++) {

            if (isimler.get(i).length() > enUzunKelime.length()){
                enUzunKelime = isimler.get(i);
            }

        }
        System.out.println( enUzunKelime);


    }
}
