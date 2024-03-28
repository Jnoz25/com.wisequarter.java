package day09_switchStatement_StringManipulations;

public class C08_substring {
    public static void main(String[] args) {

        String str = "Java guzeldir";

        System.out.println(str.substring(5 , 8));

        System.out.println(str.substring(0 , str.length()-4));

        System.out.println(str.substring(5,5));

        System.out.println(str.substring(0, 1));

        System.out.println(str.substring(3,4));

        System.out.println(str.substring(3,4).toLowerCase());
        System.out.println(str.substring(3,4).toUpperCase());





    }
}
