package day14_methodOlusturmaVeKullanma;

public class C01_Return {
    public static void main(String[] args) {

    String str = "Java kolaydır";
        System.out.println(str.substring(3));

        System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf("x"));
        System.out.println(str.contains("Java"));

        System.out.println(str.substring(7));
        String strinIlkYarisi = str.substring(0,str.length()/2);

        System.out.println(str.substring(6));


    }
}
