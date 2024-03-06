import java.util.Scanner;

public class PositifNegatif {
    public static void main(String[] args) {
        // inisiai variabel angka dengan tipe data integer
        int angka;

        // membuat scanner baru
        try (Scanner x = new Scanner(System.in)) {
            // membuat perulangan do while
            // perulangan akan terus berjalan selama angka tidak sama dengan 0
            do {
                System.out.print("Inputkan sebuah bilangan : ");
                // mengambil inputan dari user
                angka = x.nextInt();

                // mengecek apakah angka positif atau negatif
                // jika angka lebih dari 0 maka kondisi if akan dijalankan
                if (angka > 0)
                    System.out.println("bilangan " + angka + " adalah bilangan positif");
                // jika angka kurang dari 0 maka kondisi else akan dijalankan
                else
                    System.out.println("bilangan " + angka + " adalah bilangan negatif");

                // perulangan akan terus berjalan selama angka tidak sama dengan 0
            } while (angka != 0);
        }
    }
}
