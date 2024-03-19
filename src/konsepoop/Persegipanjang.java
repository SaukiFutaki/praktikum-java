package konsepoop;

public class Persegipanjang {
  int luas;

  void hitungLuas(int panjang, int lebar){
    luas = panjang * lebar;
  }

  void cetakLuas(){
    System.out.println("Luas persegi panjang adalah " + luas);
  }
}
