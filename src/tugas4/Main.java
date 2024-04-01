package tugas4;

public class Main {
  public static void main(String[] args) {
    CdFilm cdFilm = new CdFilm("The Avengers", 10, "Robert Downey Jr", "Joss Whedon", "Kevin Feige", "Action");
    cdFilm.cetak();

    CdMusik cdMusik = new CdMusik("The Best of Dewa 19", 10, "Dewa 19", "Ahmad Dhani", "Sony Music", "Kangen", "Pop");
    cdMusik.cetak();
  }
  
}
