package tugasKonsepOop;

public class OpsiA {
  public static void printSegitigaAtas(int rows) {
    for (int i = 1; i <= rows; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
}
