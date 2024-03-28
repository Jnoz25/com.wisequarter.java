package day10_StringManipulations;



public class C04_startsWith_endWith {
    public static void main(String[] args) {

        String str = "Ali topu at, at Ali at";

        System.out.println(str.contains("Ali"));
        System.out.println(str.contains("top"));
        System.out.println(str.contains("at"));

        System.out.println(str.endsWith("Ali"));
        System.out.println(str.startsWith("Ali"));

    }
}
