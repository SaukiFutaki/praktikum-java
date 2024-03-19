public class Pa {
  public static void main(String[] args) {
    int tinggi = 5;
    hitungpolaA(tinggi);
    cetak(tinggi);
}

public static void printSegitigaAtas(int rows) {
  for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= i; j++) {
          System.out.print("* ");
      }
      System.out.println();
  }
}

public static void cetak(int tinggi) {
    System.out.println("Tinggi segitiga adalah " + tinggi);
}
}
