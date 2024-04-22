package tugas4;

public class CdFilm extends Cd{
   String pemain;
   String sutradara;
   String produser;
   String kategori;
  
  public CdFilm(String judul, int stok, String pemain, String sutradara, String produser, String kategori){
    this.judul = judul;
    this.stok = stok;
    this.pemain = pemain;
    this.sutradara = sutradara;
    this.produser = produser;
    this.kategori = kategori;
  }

  void cetak(){
    System.out.println("Judul: " + judul);
    System.out.println("Stok: " + stok);
    System.out.println("Kategori: " + kategori);
    System.out.println("Sutradara: " + sutradara);
    System.out.println("Produser: " + produser);
    System.out.println("Pemain: " + pemain);
  }
  
}
