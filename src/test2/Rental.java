package test2;

import java.text.NumberFormat;
import java.util.Locale;

public class Rental {
  private SportsField field;
  private String customerName;
  private String customerPhone;
  private int duration; // in hours
  private int price; // in cents

  public Rental(SportsField field, String customerName, String customerPhone, int duration, int price) {
    this.field = field;
    this.customerName = customerName;
    this.customerPhone = customerPhone;
    this.duration = duration;
    this.price = setDefaultPrice(field.getSport()) * duration * 100; // Convert to cents
  }

  public int getPrice() {
    return price;
  }

  private int setDefaultPrice(String sport) {
      int defaultPrice = 0;
      switch (sport) {
          case "Sepak Bola":
              defaultPrice = 100000; // 100,000 IDR
              break;
          case "Futsal":
          case "Basket":
              defaultPrice = 50000; // 50,000 IDR
              break;
          default:
              System.out.println("Invalid sport type. Using default price: 100,000 IDR");
              defaultPrice = 100000; // 100,000 IDR
      }
      return defaultPrice;
  }

  public String getDetails() {
    Locale localeID = new Locale("in", "ID");
    NumberFormat formatIDR = NumberFormat.getCurrencyInstance(localeID);
    String priceIDR = formatIDR.format((double) price / 100);

    return "Rental Detail:\n" +
        "Lapangan" + field.getName() + " (" + field.getSport() + ")\n" +
        "Nama penyewa: " + customerName + "\n" +
        "No hp penyewa: " + customerPhone + "\n" +
        "Durasi: " + duration + " jam\n" +
        "Price: " + priceIDR;
  }
}