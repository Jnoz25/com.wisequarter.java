package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_IstenmeyenleriSil {
    public static void main(String[] args) {


        List<String> isimler = new ArrayList<>(Arrays.asList("Seher","Seren","Meltem","Bekir","Sait","Hasan"));
                String istenmeyenHarf = "e";

        System.out.println(isimler);
        System.out.println(istenmeyenHarfleriSil(isimler,istenmeyenHarf));
    }

    public static List<String > istenmeyenHarfleriSil(List<String>isimler, String istenmeyenHarf){

        for (int i = 0; i < isimler.size(); i++) {

            if (isimler.get(i).contains(istenmeyenHarf)){
                isimler.remove(i);
                i--;
            }

        }
        return isimler;
    }



}
