
package punyaedo;


public class CDFilm {
    private String judul;
    private String[] pemain;
    private String sutradara;
    private String produser;
    private String kategori;
    private int stok;

    // Constructor
    public CDFilm(String judul, String[] pemain, String sutradara, String produser, String kategori, int stok) {
        this.judul = judul;
        this.pemain = pemain;
        this.sutradara = sutradara;
        this.produser = produser;
        this.kategori = kategori;
        this.stok = stok;
    }

    CDFilm(String judul, String produser, int stok, String[] pemain, String sutradara, String kategori) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Getter methods
    public String getJudul() {
        return judul;
    }

    public String[] getPemain() {
        return pemain;
    }

    public String getSutradara() {
        return sutradara;
    }

    public String getProduser() {
        return produser;
    }

    public String getKategori() {
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
        String[] pemain = {"Marlon Brando", "Al Pacino"};
        CDFilm film = new CDFilm("The Godfather", pemain, "Francis Ford Coppola", "Paramount Pictures", "D", 10);
        System.out.println("Judul: " + film.getJudul());
        System.out.println("Pemain: " + String.join(", ", film.getPemain()));
        System.out.println(film.getSutradara() + "Sutradara: ");
        System.out.println("Produser: " + film.getProduser());
        System.out.println("Kategori: " + film.getKategori());
        System.out.println("Stok: " + film.getStok());
    }
}

