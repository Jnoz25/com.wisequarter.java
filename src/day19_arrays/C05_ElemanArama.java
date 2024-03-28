package day19_arrays;

public class C05_ElemanArama {
    public static void main(String[] args) {

        int[] arr = {3,5,6,2,3,6,7,9,6,5,4,9,3,4,5};

        elemanVarMi(arr,3);
    }



    public static void elemanVarMi (int[] arr, int arananSayi){

        int bulunanAdet = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == arananSayi){

                bulunanAdet++;
            }

        }
        if (bulunanAdet == 0){
            System.out.println("Aranan eleman arrayde yok");
        }else {
            System.out.println("Aranan sayi arreyde " + bulunanAdet + "adet kullanilmistir.");
        }


    }

}
