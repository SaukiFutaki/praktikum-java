package inheritance;

public class Persegi extends BangunRuang {
  double sisi;

  public Persegi(int sisi){
    this.sisi = sisi;

  }

  void hitungLuas(){
    super.luas = sisi * sisi;
  }

  void cetak(){
    System.out.println("Luas Persegi: " + luas);
  }
  
}
