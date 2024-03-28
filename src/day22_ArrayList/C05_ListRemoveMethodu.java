package day22_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_ListRemoveMethodu {
    public static void main(String[] args) {

        List<String > harfler = new ArrayList<>(Arrays.asList("a","r","a","t","a","s"));

        System.out.println(harfler);

        harfler.remove("a");

        System.out.println(harfler);

        harfler.remove("x");

        System.out.println(harfler);

        List<String> karakterler = new ArrayList<>(Arrays.asList("9","a","%","i","#"));

        System.out.println(karakterler.removeAll(harfler));


    }
}
