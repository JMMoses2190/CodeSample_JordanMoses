/**
 * Beer.java
 * Authored by Jordan Moses
 * Creates a new beer drink
 */

public class Beer extends Drink {

  private String name;
  private String carbonation;
  private double alContent;

  //Sets the properties of a beer
  public Beer(String name, String carbonation, double alContent) {

    this.name = name;
    this.carbonation = carbonation;
    this.alContent = alContent;
  }

  //Creates a new description format specifically for a beer
  @Override
  public String getDesc() {
    return String.format(
        "%s, %s, %.2f %%.", this.getName(), this.isCarbonated(), this.getContent());
  }

  //Creates beer name
  @Override
  public String getName() {

    return name;
  }

  //Creates beer carbonation
  @Override
  public String isCarbonated() {
    return carbonation;
  }

  //Sets the alcohol content of the beer
  private double getContent() {
    return alContent;
  }
}
