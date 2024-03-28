package day19_arrays;

public class C04_TekveCiftUzunluktakiKelimeleriSay {
    public static void main(String[] args) {

    String[] isimler = {"Kerim","Fırat","Fatma","Bidik","Rıza"};

    kelimeSayilariniyazdir(isimler);

    }


    public static void kelimeSayilariniyazdir(String[] arr ){

        int tekSayiAdet = 0;
        int ciftsayiAdet = 0;

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i].length() % 2 == 0){
                ciftsayiAdet++;
            }else {
                tekSayiAdet++;
            }

        }
        System.out.println("arreyde " + tekSayiAdet +"adet uzunlugu tek olan kelime, \n" +
                ciftsayiAdet + "adet uzunlugu cift olan kelime var");


    }
}
