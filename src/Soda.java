/**
 * Sode.java
 * Authored by Jordan Moses
 * Creates a new soda drink
 */

public class Soda extends Drink {

  private String name;
  private String carbonation;

  //Sets properties of a soda
  public Soda(String name, String carbonation) {

    this.name = name;
    this.carbonation = carbonation;
  }

  //Sets a new description format for a soda drink
  @Override
  public String getDesc() {
    return String.format("%s, %s", this.getName(), this.isCarbonated());
  }

  //Sets new soda name
  @Override
  public String getName() {

    return name;
  }

  //Sets new soda carbonation
  @Override
  public String isCarbonated() {
    return carbonation;
  }
}
