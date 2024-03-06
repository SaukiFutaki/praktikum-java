import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan pilihan Anda (a/b): ");
        String pilihan = scanner.nextLine();
        scanner.close();

        if (pilihan.equalsIgnoreCase("a")) {
            int rows;
            rows = 5;
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } else if (pilihan.equalsIgnoreCase("b")) {
            int n = 5;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k <= i * 2; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }
}