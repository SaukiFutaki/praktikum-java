package inheritance;

public class Main {
  public static void main(String[] args) {
    Segitiga segitiga = new Segitiga(10, 5);
    segitiga.hitungLuas();
    segitiga.cetak();

    Persegi B = new Persegi(20);
    B.hitungLuas();
    B.cetak();


  }
  
}
