package tugas4;

public class Cd {
  protected String judul;
  protected int stok;
  protected String kategori;
  protected String sutradara;
  protected String produser;
  protected String pemain;
  

  void cetak(){
    System.out.println("Judul: " + judul);
    System.out.println("Stok: " + stok);
    System.out.println("Kategori: " + kategori);
    System.out.println("Sutradara: " + sutradara);
    System.out.println("Produser: " + produser);
    System.out.println("Pemain: " + pemain);
  }
}
