
package punyahusni.tugas4;

public class CDFilm extends CD{
    private String sutradara,produser ;
    protected String namaClass = "CDFilm";

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

    protected String keterangan_CD() {
        return super.namaClass + " : " + super.keterangan ();
    }

    protected void hapus() {
        sutradara=null;
        produser=null;
        super.hapus();
    }
}
