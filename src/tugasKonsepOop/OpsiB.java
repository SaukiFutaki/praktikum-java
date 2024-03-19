package tugasKonsepOop;

public class OpsiB {
  public static void printSegitigaTerbalik(int rows) {
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < rows - i - 1; j++) {
            System.out.print(" ");
        }
        for (int k = 0; k <= i * 2; k++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
}
