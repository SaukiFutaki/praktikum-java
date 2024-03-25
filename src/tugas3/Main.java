package tugas3;

public class Main {
  public static void main(String[] args) {
    Tugas test1 = new Tugas(27);
    if(test1.positifGenap()){
      System.out.println("Bilangan " + test1.getBilangan() + " adalah bilangan positif genap");
    } else if (test1.positifGanjil()){ 
      System.out.println("Bilangan " + test1.getBilangan() + " adalah bilangan positif ganjil");
    } else if (test1.negatifGenap()){ 
      System.out.println("Bilangan " + test1.getBilangan() + " adalah bilangan negatif genap");
    } else if (test1.negatifGanjil()){ 
      System.out.println("Bilangan " + test1.getBilangan() + " adalah  bilangan negatif ganjil");
    } else {
      System.out.println("wlwlwlwllw");
    }
  }
  
}
