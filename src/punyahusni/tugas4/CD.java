
package punyahusni.tugas4;


public class CD {
    private String judul, pemain ,sutradara,produser,kategori,stock, penyanyi,publisher, tophits ;
    protected String namaClass = "CD";

    protected void publisher(String publisher) {
        this.publisher = publisher;
        publisher = null;
    }

    protected String getpublisher() {
        return publisher;
    }


    protected void tophits(String tophits) {
        this.tophits = tophits;
        tophits = null;
    }

    protected String gettophits() {
        return tophits;
    }


    protected void judul(String judul) {
        this.judul = judul;
        judul = null;
    }

    protected String getjudul() {
        return judul;
    }
    
    protected void pemain(String pemain ) {
        this.pemain = pemain;
        pemain = null;
    }

    protected String getpemain() {
        return pemain ;
    }
    
    protected void sutradara(String sutradara) {
        this.sutradara = sutradara;
        sutradara = null;
    }

    protected String getsutradara() {
        return sutradara ;
    }
    


    protected void produser(String produser) {
        this.produser = produser;
        produser = null;
    }

    protected String getproduser() {
        return produser;
    }

    protected void penyanyi(String penyanyi) {
        this.penyanyi = penyanyi;
        penyanyi = null;
    }

    protected String getpenyanyi() {
        return penyanyi;
    }

        protected void kategori(String kategori) {
        this.kategori = kategori;
        kategori = null;
    }

    protected String getkategori() {
        return kategori;
    }

    protected void stock(String stock) {
        this.stock = stock;
        stock = null;
    }

    protected String getstock(){
        return stock;
    }
    

    protected void tampil(String a) {
        System.out.println(a);
        a = null;
    }

    protected String keterangan() {
        return ("ini adalah class " + namaClass);
    }

    protected void hapus() {
        judul = null;
        stock = null;
        kategori = null;
        sutradara = null; 
        produser = null;
        pemain = null;
        namaClass = null;
    }

    }



