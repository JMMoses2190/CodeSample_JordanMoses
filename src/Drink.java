/**
 * Drink.java
 * Authored by Jordan Moses
 * Creates a new generic drink
 */

public abstract class Drink {

  //Takes a string and sets it to the name of the drink
  public String getName() {
    String name = this.getName();
    return name;
  }

  //Takes a string and sets it to the carbonation
  public String isCarbonated() {
    String carbonated = this.isCarbonated();
    return carbonated;
  }

  //Formats the output of information for the drink
  public String getDesc() {
    return String.format("%s, %s.\n", this.getName(), this.isCarbonated());
  }
}
