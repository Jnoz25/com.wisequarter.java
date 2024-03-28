package day20_Arrays_MultiDimensionalArrays;

public class C01_Arrays {

    public static void main(String[] args) {

        // verilen int bir array'de
        // verilen min ve max degerler dahil olarak
        // min ve max degerler arasındaki sayilari yazdiran bir method olsturun.

        int[] sayilar = {23,45,12,78,54,1,98};

        araliktakiSayilariyazdir(sayilar,10,40);

        araliktakiSayilariyazdir(sayilar,15,66);

    }

    public static void araliktakiSayilariyazdir (int[] arr, int minDeger ,int maxDeger){

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] >= minDeger && arr[i] <= maxDeger) {
                System.out.print(arr[i] + " ");
            }

        }
        System.out.println("     ");
    }
}
