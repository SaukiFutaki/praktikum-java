package test2;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
   

    int choice;
    do {
      JOptionPane.showMessageDialog(null, "Selamat datang di aplikasi penyewaan lapangan olahraga!");
      String input =  JOptionPane.showInputDialog( "Pilih jenis lapangan olahraga:\n1. Soccer 100k/j\n2. Basket 50k/j\n3. Futsal 100k/j");
      choice = Integer.parseInt(input);
    } while (choice < 1 || choice > 3);


    String sport = "";
    switch (choice) {
      case 1:
        sport = "Sepak Bola";
        break;
      case 2:
        sport = "Basket";
        break;
      case 3:
        sport = "Futsal";
        break;
      default:
      
      scanner.close();
      
    }

    // Create a sports field
    SportsField field = new SportsField(":", sport);

    // Get user input for renter's name, phone number, and rental duration
    String customerName = JOptionPane.showInputDialog("Masukan nama penyewa:");
    String customerPhone = JOptionPane.showInputDialog("Masukan nomer handphone penyewa:");
    String durationInput = JOptionPane.showInputDialog("Masukan durasi(jam) :");
    int duration = Integer.parseInt(durationInput);

    // Create a rental for the sports field
    Rental rental = new Rental(field, customerName, customerPhone, duration, 150000);

    // Print the details of the rental
    JOptionPane.showMessageDialog(null, rental.getDetails());

    scanner.close();
  }
}
