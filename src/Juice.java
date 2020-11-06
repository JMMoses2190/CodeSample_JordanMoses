/**
 * Juice.java
 * Authored by Jordan Moses
 * Creates a new juice drink
 */

public class Juice extends Drink {

  private String name;
  private String carbonation;
  private String fruit;

  //Sets properties of a juice drink
  public Juice(String name, String carbonation, String fruit) {

    this.name = name;
    this.carbonation = carbonation;
    this.fruit = fruit;
  }

  //Creates new format specifically for a juice drink
  @Override
  public String getDesc() {
    return String.format("%s, %s, %s", this.getName(), this.isCarbonated(), this.getFruit());
  }

  //Creates new juice name
  @Override
  public String getName() {

    return name;
  }

  //Creates new carbonation
  @Override
  public String isCarbonated() {
    return carbonation;
  }

  //Sets what fruit a juice is made from
  private String getFruit() {
    return fruit;
  }
}
