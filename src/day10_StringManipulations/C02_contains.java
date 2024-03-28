package day10_StringManipulations;

public class C02_contains {
    public static void main(String[] args) {

        String str = "Ali top at, at Ali at";

        System.out.println(str.contains("Ali"));

        System.out.println(str.contains("ali") || str.contains("at"));
        System.out.println(str.contains("ali") && str.contains("at"));


    }
}
