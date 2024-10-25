import java.util.HashMap;

public class HashMapStringstring {
    //An HashMap For String, String of Planet Locations.
    //The List of Planets I am using are the ones set by NASA. https://science.nasa.gov/solar-system/planets/
  public static void main(String[] args) {
    // Create a HashMap object labeled as PlanetLocation.
    HashMap<String, String> planetLocation = new HashMap<>(); //Instantiate

    planetLocation.put("Inner1st", "Mercury");
    planetLocation.put("Inner2nd", "Venus");
    planetLocation.put("Inner4th", "Earth");
    planetLocation.put("Inner5th", "Mars");

    planetLocation.put("Outer1st", "Jupiter");
    planetLocation.put("Outer2nd", "Saturn");
    planetLocation.put("Outer3rd", "Uranus");
    planetLocation.put("Outer4th", "Neptune");
    
    for (String i : planetLocation.keySet()) { //Makes a forloop to show the output.
      System.out.println("Location: " + i + " Plannet: " + planetLocation.get(i));
    }
  }
}

// The HashMap works like an ArrayList however it stores its list in a "Key"
// and "Value" pairs. You access the Hashmap via another type like String.
// A Hashmap is able to store differet Strings and Integers or the same type.

//Wayne Novich
