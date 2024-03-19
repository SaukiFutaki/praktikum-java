package punyahusni;

public class PolaB {
  public static void main(String[] args) {
    int tinggi = 5;
    hitungpolaB(tinggi);

}
public static void hitungpolaB(int tinggi){
    for (int i = 0; i < tinggi; i++) {
        for (int j = tinggi - i; j > 1; j--) {
            System.out.print(" ");
        }
        for (int j = 0; j <= i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
    System.out.println("Tinggi segitiga adalah " + tinggi);
}

}
