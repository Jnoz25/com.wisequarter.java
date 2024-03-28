package day09_switchStatement_StringManipulations;

public class C05_charAt {
    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println( str.charAt(0));

        System.out.println(str.toUpperCase().charAt(1));

        System.out.println(str.toUpperCase().charAt(10));

        System.out.println(str.charAt(str.length()-1));

        System.out.println("length : " + str.length());
    }
}
