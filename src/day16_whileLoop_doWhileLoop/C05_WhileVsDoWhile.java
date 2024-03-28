package day16_whileLoop_doWhileLoop;

public class C05_WhileVsDoWhile {
    public static void main(String[] args) {

        int sayi = 20;

        while (sayi<10){
            System.out.println("While loop body'si calisti");
            sayi--;
        }

        do{


            System.out.println("Do While loop body'si calisti");
            sayi--;



        }while (sayi<10);



    }
}
