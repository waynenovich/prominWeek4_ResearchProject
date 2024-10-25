import java.util.ArrayList;

public class Main { //This Is for an ArrayList of Strings. 
    public static void main(String[] args) {
        //An Array List string for Planets in our Solar System.
        ArrayList<String> Planets = new ArrayList<>(); //This builds the object list.
        //The List of Planets I am using are the ones set by NASA. https://science.nasa.gov/solar-system/planets/
        //Inner Planmets \/.
        Planets.add("Mercury");
        Planets.add("Venus");
        Planets.add("Earth");
        Planets.add("Mars");
        //Outer Planets \/.
        Planets.add("Jupiter");
        Planets.add("Saturn");
        Planets.add("Uranus");
        Planets.add("Neptune");
        //Dwarf Planets \/.
        Planets.add("Ceres");
        Planets.add("Pluto");
        Planets.add("Haumea");
        Planets.add("Makemake");
        Planets.add("Eris");
        for (int i = 0; i < Planets.size(); i++) { //This makes it so each planet is on its own line.
            System.out.println(Planets.get(i));
        }      
    }
}


// The Array List in Java allows a list of strings to be created and shown to the user
// through the terminal or interface. An Array List can contain strings labeled in the
// array by the array's title (in this case, Planets) followed by an .add(). The .add()
// method has no limit to how many can be added or removed when needed, unlike built-in
// arrays, which have unchangeable sizes. 

//Wayne Novich