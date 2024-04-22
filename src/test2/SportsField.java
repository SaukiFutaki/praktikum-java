package test2;

public class SportsField {
  private String name;
  private String sport;

  public SportsField(String name, String sport) {
      this.name = name;
      this.sport = sport;
  }


  public String getName() {
      return name;
  }


  public String getSport() {
      return sport;
  }

  public void setName(String name) {
      this.name = name;
  }


  public void setSport(String sport) {
      this.sport = sport;
  }
}
