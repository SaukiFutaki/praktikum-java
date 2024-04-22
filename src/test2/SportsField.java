package test2;

public class SportsField {
  private String name;
  private String sport;

  public SportsField(String name, String sport) {
      this.name = name;
      this.sport = sport;
  }

  // Getter for name
  public String getName() {
      return name;
  }

  // Getter for sport
  public String getSport() {
      return sport;
  }

  // Setter for name
  public void setName(String name) {
      this.name = name;
  }

  // Setter for sport
  public void setSport(String sport) {
      this.sport = sport;
  }
}