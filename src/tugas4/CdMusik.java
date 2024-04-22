package tugas4;

public class CdMusik extends Cd{
  String penyanyi;
  String judul;
  String produser;
  String publisher;
  String tophits;
  Object kategori;
  
 public CdMusik(String judul, int stok, String penyanyi, String produser, String publisher, String tophits, Object kategori){
    this.judul = judul;
    this.stok = stok;
    this.penyanyi = penyanyi;
    this.produser = produser;
    this.publisher = publisher;
    this.tophits = tophits;
    this.kategori = kategori;
  }

  void cetak(){
    System.out.println("Judul: " + judul);
    System.out.println("Stok: " + stok);
    System.out.println("Kategori: " + kategori);
    System.out.println("Penyanyi: " + penyanyi);
    System.out.println("Produser: " + produser);
    System.out.println("Publisher: " + publisher);
    System.out.println("Top Hits: " + tophits);
  }
  


  
  
}
