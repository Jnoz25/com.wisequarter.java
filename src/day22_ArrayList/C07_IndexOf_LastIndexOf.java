package day22_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_IndexOf_LastIndexOf {

    public static void main(String[] args) {

        List<String> harfler = new ArrayList<>(Arrays.asList("a","d","a","y","a","d","m"));

        System.out.println(harfler); //[a, d, a, y, a, d, m]

        System.out.println(harfler.get(2));

        System.out.println(harfler.indexOf("a"));
        System.out.println(harfler.lastIndexOf("a"));
        System.out.println(harfler.indexOf("y"));
        System.out.println(harfler.indexOf("y"));
        System.out.println(harfler.lastIndexOf("k"));

    }
}
