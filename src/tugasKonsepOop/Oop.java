package tugasKonsepOop;

import java.util.Scanner;

public class Oop {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan pilihan Anda (a/b): ");
        String pilihan = scanner.nextLine();
        scanner.close();

        if (pilihan.equalsIgnoreCase("a")) {
            OpsiA.printSegitigaAtas(5); // Replace 5 with desired number of rows for option A
        } else if (pilihan.equalsIgnoreCase("b")) {
            OpsiB.printSegitigaTerbalik(5); // Replace 5 with desired number of rows for option B
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }
}
