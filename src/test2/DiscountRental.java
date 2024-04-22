package test2;

import java.text.NumberFormat;
import java.util.Locale;

public class DiscountRental extends Rental {
  private double discount; 

  public DiscountRental(SportsField field, String customerName, String customerPhone, int duration, int price) {
    super(field, customerName, customerPhone, duration, price);
    this.discount = 0; 
  }

  // Getter for discount
  public double getDiscount() {
    return discount;
  }

  // Setter for discount
  public void setDiscount(double discount) {
    this.discount = discount;
  }

  // Method to calculate discounted price
  public int calculateDiscountedPrice() {
    double discountedPrice = getPrice() * (1 - (discount / 100));
    return (int) Math.round(discountedPrice);
  }

  // Overriding getDetails method to include discount information
  @Override
  public String getDetails() {
    String rentalDetails = super.getDetails();
    Locale localeID = new Locale("in", "ID");
    NumberFormat formatIDR = NumberFormat.getCurrencyInstance(localeID);
    String discountedPriceIDR = formatIDR.format((double) calculateDiscountedPrice() / 100);

    return rentalDetails + "\nDiskon: " + discount + "%\nHarga Diskon: " + discountedPriceIDR;
  }
}
