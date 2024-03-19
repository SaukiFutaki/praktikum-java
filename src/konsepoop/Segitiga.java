package konsepoop;

public class Segitiga {
  double alas,tinggi, luas;

  void hitungLuas(){
    luas = 0.5 * alas * tinggi;
  }

  void cetakLuas(){
    System.out.println("Luas segitiga adalah " + luas);
  }
}
