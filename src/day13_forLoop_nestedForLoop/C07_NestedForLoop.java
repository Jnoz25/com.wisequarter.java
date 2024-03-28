package day13_forLoop_nestedForLoop;

public class C07_NestedForLoop {
    public static void main(String[] args) {

        //For loop ile 1 2 3 4 yazdırın

        for (int i = 1; i <= 4; i++) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

        for (int i = 1; i <= 4; i++) {
            System.out.print(2 * i + " ");
        }
        System.out.println(" ");

        for (int i = 1; i <= 4; i++) {
            System.out.print(3 * i + " ");
        }

        System.out.println("Dikdortgen bicimde konsol cıktısı icin nested for loop kullanılır");

        for (int i = 0; i <=3 ; i++) {

            for (int j = 1; j < 4; j++) {


                System.out.print(i*j + " ");
                
            }
            System.out.println("");
            
        }

    }
}