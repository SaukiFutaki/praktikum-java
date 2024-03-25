package tugas3;

public class Tugas {
  private int bilangan;




  public Tugas(int bilangan) {
    this.bilangan = bilangan;
  }

  public boolean positifGenap(){  
    return bilangan > 0 && bilangan % 2 == 0;
  } 

  public boolean positifGanjil(){
    return bilangan > 0 && bilangan % 2 != 0;
  }

  public boolean negatifGenap(){
    return bilangan < 0 && bilangan % 2 == 0;
  }

  public boolean negatifGanjil(){
    return bilangan < 0 && bilangan % 2 != 0;
  }


  public int getBilangan() {
    return bilangan;
  }
}
