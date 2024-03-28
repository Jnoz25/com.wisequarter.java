package day09_switchStatement_StringManipulations;

public class C06_equals_equalsIgnoreCase {
    public static void main(String[] args) {

        String str1 = "java";
        String str2 = "Java";
        String str3 = "JAVA";
        String str4 = "Java";
        String str5 = "JAVA ";


        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));
        System.out.println(str2.equals(str4));
        System.out.println(str2.equals(str5));
        System.out.println(str3.equals(str5));

        System.out.println(" ********************* ");

        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.equalsIgnoreCase(str4));
        System.out.println(str2.equalsIgnoreCase(str4));
        System.out.println(str2.equalsIgnoreCase(str5));
        System.out.println(str3.equalsIgnoreCase(str5));

        System.out.println("-------------------");
        String s1 = "java";
        String s2 = "java";
        String s3 = new String("java");
        String s4 = "ja"+"va";
        String a = "ja";
        String b = "va";
        String s5 = a+b;

        System.out.println( s1.equals(s2));
        System.out.println( s1.equals(s3));



    }
}
