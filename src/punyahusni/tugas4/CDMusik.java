
package punyahusni.tugas4;


public class CDMusik extends CD{
    private String penyanyi,publisher,tophits ;
    protected String namaClass = "CDMusik";

    protected void penyanyi(String penyanyi) {
        this.penyanyi = penyanyi;
        penyanyi = null;
    }

    protected String getpenyanyi() {
        return penyanyi;
    }
    
    protected void publisher(String publisher ) {
        this.publisher = publisher;
        publisher = null;
    }

    protected String getpublisher() {
        return publisher ;
    }
    
    protected void tophits(String tophits) {
        this.tophits = tophits;
        tophits = null;
    }

    protected String gettophits() {
        return tophits ;
    }
     protected String keterangan_CD() {
        return super.namaClass + " : " + super.keterangan ();
    }

    protected void hapus() {
        penyanyi=null;
        publisher=null;
        tophits=null;
        super.hapus();
    }




}
