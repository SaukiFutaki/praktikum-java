
package punyaedo;

import java.util.ArrayList;
import java.util.List;


class VCD {
    String judul;
    String produser;
    int stok;

    public VCD(String judul, String produser, int stok) {
        this.judul = judul;
        this.produser = produser;
        this.stok = stok;
    }

    // Getter methods
    public String getJudul() {
        return judul;
    }

    public String getProduser() {
        return produser;
    }

    public int getStok() {
        return stok;
    }

    // Setter method for updating stock
    public void updateStok(int newStok) {
        this.stok = newStok;
    }
}

// Subclass for VCD Film
class CDFilm extends VCD {
    String[] pemain;
    String sutradara;
    String kategori;

    public CDFilm(String judul, String produser, int stok, String[] pemain, String sutradara, String kategori) {
        super(judul, produser, stok);
        this.pemain = pemain;
        this.sutradara = sutradara;
        this.kategori = kategori;
    }

    // Getter methods
    public String[] getPemain() {
        return pemain;
    }

    public String getSutradara() {
        return sutradara;
    }

    public String getKategori() {
        return kategori;
    }
}

// Subclass for CD Musik
class CDMusik extends VCD {
    String penyanyi;
    String publisher;
    String[] topHits;
    char kategori;

    public CDMusik(String judul, String produser, int stok, String penyanyi, String publisher, String[] topHits, char kategori) {
        super(judul, produser, stok);
        this.penyanyi = penyanyi;
        this.publisher = publisher;
        this.topHits = topHits;
        this.kategori = kategori;
    }

    // Getter methods
    public String getPenyanyi() {
        return penyanyi;
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
}

class RentalVCD {
    List<CDFilm> vcdFilmList = new ArrayList<>();
    List<CDMusik> cdMusikList = new ArrayList<>();

    public void addVcdFilm(String judul, String produser, int stok, String[] pemain, String sutradara, String kategori) {
        CDFilm vcdFilm = new CDFilm(judul, produser, stok, pemain, sutradara, kategori);
        vcdFilmList.add(vcdFilm);
    }

    public void addCdMusik(String judul, String produser, int stok, String penyanyi, String publisher, String[] topHits, char kategori) {
        CDMusik cdMusik = new CDMusik(judul, produser, stok, penyanyi, publisher, topHits, kategori);
        cdMusikList.add(cdMusik);
    }

    public void displayVcdFilm() {
        System.out.println("Daftar VCD Film yang Telah Di-entrikan:");
        for (CDFilm vcdFilm : vcdFilmList) {
            System.out.println("Judul: " + vcdFilm.getJudul() + ", Produser: " + vcdFilm.getProduser() +
                    ", Kategori: " + vcdFilm.getKategori() + ", Stok: " + vcdFilm.getStok());
        }
    }

    public void displayCdMusik() {
        System.out.println("Daftar CD Musik yang Telah Di-entrikan:");
        for (CDMusik cdMusik : cdMusikList) {
            System.out.println("Judul: " + cdMusik.getJudul() + ", Produser: " + cdMusik.getProduser() +
                    ", Kategori: " + cdMusik.getKategori() + ", Stok: " + cdMusik.getStok());
        }
    }

    public static void main(String[] args) {
        RentalVCD rentalVCD = new RentalVCD();

        rentalVCD.addVcdFilm("The Godfather", "Paramount Pictures", 10, new String[]{"Marlon Brando", "Al Pacino"}, "Francis Ford Coppola", "D");
        rentalVCD.addVcdFilm("Titanic", "20th Century Studios", 15, new String[]{"Leonardo DiCaprio", "Kate Winslet"}, "James Cameron", "R");

        rentalVCD.addCdMusik("Thriller", "Quincy Jones", 20, "Michael Jackson", "Epic Records", new String[]{"Thriller", "Beat It", "Billie Jean"}, 'P');
        rentalVCD.addCdMusik("Back in Black", "Robert John 'Mutt' Lange", 25, "AC/DC", "Atlantic Records", new String[]{"Back in Black", "You Shook Me All Night Long", "Hells Bells"}, 'R');

        rentalVCD.displayVcdFilm();
        rentalVCD.displayCdMusik();
    }
}
