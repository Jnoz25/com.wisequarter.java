package day13_forLoop_nestedForLoop;

import java.util.Scanner;

public class C08_NestedForLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen satır ve sutun değerlerini giriniz");
        int sutun = scanner.nextInt();
        int satır = scanner.nextInt();





    for (int i = sutun; i <= sutun; i++) {
        for (int j = sutun; j <= i + sutun; j++) {
            System.out.print(j + " " + i );
        }
        System.out.println();
    }
}
}


