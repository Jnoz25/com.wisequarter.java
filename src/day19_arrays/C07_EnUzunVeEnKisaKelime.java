package day19_arrays;

public class C07_EnUzunVeEnKisaKelime {
    public static void main(String[] args) {

        String [] isimler = {"Meltem","Seren","Emrah","Ali","Ahmet","Semih"};

        enUzunEnKisaKelimeleriYazdir(isimler);

    }

    public static void enUzunEnKisaKelimeleriYazdir(String[] kelimeler){

        String enuzunKelime = kelimeler[0];
        String enKisaKelime = kelimeler[0];

        for (int i = 0; i < kelimeler.length; i++) {

            if (kelimeler[i].length() > enuzunKelime.length()){

                enuzunKelime = kelimeler[i];
            } else if (kelimeler[i].length()< enKisaKelime.length()) {

                enKisaKelime = kelimeler[i];
            }
        }


        System.out.println("En uzun kelime " + enuzunKelime);
        System.out.println("En kısa Kelime " + enKisaKelime);



    }
}
