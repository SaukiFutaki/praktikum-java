package punyahusni;

public class PolaA {
  public static void main(String[] args) {
    int tinggi = 5;
    hitungpolaA(tinggi);
  
}

public static void hitungpolaA(int tinggi) {
    for (int i = 0; i < tinggi; i++) {
        for (int j = 0; j < tinggi - i - 1; j++) {
            System.out.print("  "); // Menggunakan dua spasi untuk membuat pola segitiga terbalik
        }
        for (int k = 0; k <= i; k++) {
            System.out.print("* "); // Mencetak bintang dengan spasi setelahnya
        }
        System.out.println(); // Pindah ke baris baru setelah mencetak satu baris bintang
    }
    System.out.println("Tinggi segitiga adalah ppp" + tinggi);
  
}


    
}
