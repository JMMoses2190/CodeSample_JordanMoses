/**
 * Main.java Authored by Jordan Moses Creates a new drink list and outputs the descriptions of each
 * drink to console
 */

public class Main {

  public static void main(String[] args) {

    // Build orange juice drink
    Drink orangeJuice = new Juice("Orange Juice", "not carbonated", "oranges");

    // Build Budweiser drink
    Drink budweiserBeer = new Beer("Budweiser", "carbonated", 5.0);

    // Build Pepsi drink
    Drink pepsiSoda = new Soda("Pepsi", "carbonated");

    // Create an array to store the drinks before they are added to the official list
    Drink[] drinksToAdd = {orangeJuice, budweiserBeer, pepsiSoda};

    // Create drink list at the same length of the set up array
    Drink[] drinkList = new Drink[drinksToAdd.length];

    // Add drinks from set up array to drink list
    for (int i = 0; i < drinksToAdd.length; i++) {
      drinkList[i] = drinksToAdd[i];
    }

    // Print descriptions of each drink to console
    for (int i = 0; i < drinkList.length; i++) {
      System.out.println(drinkList[i].getDesc());
    }
  }
}
