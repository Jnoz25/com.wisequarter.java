package day09_switchStatement_StringManipulations;

import java.util.Locale;

public class C04_toUpperCase_toLowerCase {
    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.toUpperCase());

        System.out.println(str.toLowerCase());

        System.out.println(str);
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase(Locale.forLanguageTag("TR")));


    }
}
