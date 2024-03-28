package day24_ArrayList_ForEachLoop;

public class C05_ForEachLoop {
    public static void main(String[] args) {

        int[] arr = {3,2,4,1};

        karelerinToplami(arr);


    }

    public static void karelerinToplami ( int[] sayilar) {

        int toplam = 0 ;

        for (int each : sayilar){

            toplam += each * each;
        }

        System.out.println(toplam);
    }


}
