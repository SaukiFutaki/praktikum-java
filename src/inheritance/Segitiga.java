package inheritance;

public class Segitiga extends BangunRuang{
  double alas, tinggi;


  public Segitiga(int alas, int tinggi){
    this.alas = alas;
    this.tinggi = tinggi;
  }

  void hitungLuas(){
    super.luas = 0.5 * alas * tinggi;
  }

  void cetak(){
    System.out.println("Luas Segitiga: " + luas);
  }
  
}
