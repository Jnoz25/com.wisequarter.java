package day13_forLoop_nestedForLoop;

import java.util.Scanner;

public class C09_NestedForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Satır sayısını girin: ");
        int satir = scanner.nextInt();

        System.out.print("Sütun sayısını girin: ");
        int sutun = scanner.nextInt();


        for (int i = 1; i <= satir; i++) {
            for (int j = 1; j <= sutun; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


