
package punyaedo;


public class CDMusik {
    private String judul;
    private String penyanyi;
    private String produser;
    private String publisher;
    private String[] topHits;
    private char kategori;
    private int stok;

    // Constructor
    public CDMusik(String judul, String penyanyi, String produser, String publisher, String[] topHits, char kategori, int stok) {
        this.judul = judul;
        this.penyanyi = penyanyi;
        this.produser = produser;
        this.publisher = publisher;
        this.topHits = topHits;
        this.kategori = kategori;
        this.stok = stok;
    }

    CDMusik(String judul, String produser, int stok, String penyanyi, String publisher, String[] topHits, char kategori) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Getter methods
    public String getJudul() {
        return judul;
    }

    public String getPenyanyi() {
        return penyanyi;
    }

    public String getProduser() {
        return produser;
    }

    public String getPublisher() {
        return publisher;
    }

    public String[] getTopHits() {
        return topHits;
    }

    public char getKategori() {
        return kategori;
    }

    public int getStok() {
        return stok;
    }

    // Setter method for updating stock
    public void updateStok(int newStok) {
        this.stok = newStok;
    }

    // Main method for testing
    public static void main(String[] args) {
        String[] topHits = {"Bohemian Rhapsody", "Stairway to Heaven", "Hotel California"};
        CDMusik cd = new CDMusik("Greatest Hits", "Queen", "Roy Thomas Baker", "EMI", topHits, 'R', 20);
        System.out.println("Judul: " + cd.getJudul());
        System.out.println("Penyanyi: " + cd.getPenyanyi());
        System.out.println("Produser: " + cd.getProduser());
        System.out.println("Publisher: " + cd.getPublisher());
        System.out.println("Top Hits: " + String.join(", ", cd.getTopHits()));
        System.out.println("Kategori: " + cd.getKategori());
        System.out.println("Stok: " + cd.getStok());
    }
}

