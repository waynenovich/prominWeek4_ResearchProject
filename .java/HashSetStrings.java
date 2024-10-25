import java.util.HashSet;

public class HashSetStrings {
    //An HashSet of StringBuilder for are the main Moons in our Solar System.
    //I am only doing the main ones because what makes a moon is subjective and so far Jupiter has about 95 total moons inlcuding the main ones.
    //The List of main Moons I am using are the ones set by NASA. https://science.nasa.gov/solar-system/moons/
    public static void main(String[] args) {
        HashSet<StringBuilder> moons = new HashSet<>();
        //Earth's Moon:
        moons.add(new StringBuilder("The Moon"));
        //Mars's Moons:
        moons.add(new StringBuilder("Phobos"));
        moons.add(new StringBuilder("Deimos"));
        //Jupiter's Moons:
        moons.add(new StringBuilder("Ganymede"));
        moons.add(new StringBuilder("Callisto"));
        moons.add(new StringBuilder("Io"));
        moons.add(new StringBuilder("Europa"));
        //Saturn's Moons:
        moons.add(new StringBuilder("Titan"));
        moons.add(new StringBuilder("Enceladus"));
        moons.add(new StringBuilder("Hyperion"));
        moons.add(new StringBuilder("Prometheus"));
        moons.add(new StringBuilder("Pandora"));
        moons.add(new StringBuilder("Janus"));
        moons.add(new StringBuilder("Epimetheus"));
        moons.add(new StringBuilder("Mimas"));
        moons.add(new StringBuilder("Iapetus"));
        moons.add(new StringBuilder("Phoebe"));
        moons.add(new StringBuilder("Tethys"));
        moons.add(new StringBuilder("Telesto"));
        //Uranus's Moons:
        moons.add(new StringBuilder("Miranda"));
        moons.add(new StringBuilder("Ariel"));
        moons.add(new StringBuilder("Umbriel"));
        moons.add(new StringBuilder("Titania"));
        moons.add(new StringBuilder("Oberon"));
        //Neptune's Moons:
        moons.add(new StringBuilder("Triton"));
        moons.add(new StringBuilder("Despina"));
        moons.add(new StringBuilder("Galatea"));
        moons.add(new StringBuilder("Halimede"));
        moons.add(new StringBuilder("Hippocamp"));
        moons.add(new StringBuilder("Laomedeia"));
        moons.add(new StringBuilder("Larissa"));
        moons.add(new StringBuilder("Naiad"));
        moons.add(new StringBuilder("Nereid"));
        moons.add(new StringBuilder("Neso"));
        moons.add(new StringBuilder("Proteus"));
        moons.add(new StringBuilder("Psamathe"));
        moons.add(new StringBuilder("Sao"));
        moons.add(new StringBuilder("Thalassa"));
        //Pluto's Moons
        moons.add(new StringBuilder("Charon"));
        moons.add(new StringBuilder("Nix"));
        moons.add(new StringBuilder("Hydra"));
        moons.add(new StringBuilder("Kerberos"));
        moons.add(new StringBuilder("Styx"));

        // Check if "The Moon" is contained in the set
        System.out.println(moons.stream().anyMatch(sb -> sb.toString().equals("The Moon")));

        // Print all elements in the Hashet on its own line.
        for (StringBuilder sb : moons) {
            System.out.println(sb);
        }
    }
}

// The HashSet lets me create a collection list where each item is unique and
// found within the package. Building an Hashet for Stringbuilder is simialr
// to an ArrayList for String however if an item is placed twice only once
// will it be shown, the is because all items have to be unique for it to be
// visable on the output.

//Wayne Novich


//Below is an updated version that includes an Hashmat but I don't think it works for what was being asked of me.
/**
 * import java.util.HashMap;
import java.util.HashSet;

public class HashMapStringstring{

    public static void main(String[] args) {
        HashMap<String, HashSet<StringBuilder>> moonsByPlanet = new HashMap<>();

        // Initialize sets of moons for each celestial body
        HashSet<StringBuilder> earthMoons = new HashSet<>();
        earthMoons.add(new StringBuilder("The Moon"));
        moonsByPlanet.put("Earth", earthMoons);

        HashSet<StringBuilder> marsMoons = new HashSet<>();
        marsMoons.add(new StringBuilder("Phobos"));
        marsMoons.add(new StringBuilder("Deimos"));
        moonsByPlanet.put("Mars", marsMoons);

        HashSet<StringBuilder> jupiterMoons = new HashSet<>();
        jupiterMoons.add(new StringBuilder("Ganymede"));
        jupiterMoons.add(new StringBuilder("Callisto"));
        jupiterMoons.add(new StringBuilder("Io"));
        jupiterMoons.add(new StringBuilder("Europa"));
        moonsByPlanet.put("Jupiter", jupiterMoons);

        HashSet<StringBuilder> saturnMoons = new HashSet<>();
        saturnMoons.add(new StringBuilder("Titan"));
        saturnMoons.add(new StringBuilder("Enceladus"));
        saturnMoons.add(new StringBuilder("Hyperion"));
        saturnMoons.add(new StringBuilder("Prometheus"));
        saturnMoons.add(new StringBuilder("Pandora"));
        saturnMoons.add(new StringBuilder("Janus"));
        saturnMoons.add(new StringBuilder("Epimetheus"));
        saturnMoons.add(new StringBuilder("Mimas"));
        saturnMoons.add(new StringBuilder("Iapetus"));
        saturnMoons.add(new StringBuilder("Phoebe"));
        saturnMoons.add(new StringBuilder("Tethys"));
        saturnMoons.add(new StringBuilder("Telesto"));
        moonsByPlanet.put("Saturn", saturnMoons);

        HashSet<StringBuilder> uranusMoons = new HashSet<>();
        uranusMoons.add(new StringBuilder("Miranda"));
        uranusMoons.add(new StringBuilder("Ariel"));
        uranusMoons.add(new StringBuilder("Umbriel"));
        uranusMoons.add(new StringBuilder("Titania"));
        uranusMoons.add(new StringBuilder("Oberon"));
        moonsByPlanet.put("Uranus", uranusMoons);

        HashSet<StringBuilder> neptuneMoons = new HashSet<>();
        neptuneMoons.add(new StringBuilder("Triton"));
        neptuneMoons.add(new StringBuilder("Despina"));
        neptuneMoons.add(new StringBuilder("Galatea"));
        neptuneMoons.add(new StringBuilder("Halimede"));
        neptuneMoons.add(new StringBuilder("Hippocamp"));
        neptuneMoons.add(new StringBuilder("Laomedeia"));
        neptuneMoons.add(new StringBuilder("Larissa"));
        neptuneMoons.add(new StringBuilder("Naiad"));
        neptuneMoons.add(new StringBuilder("Nereid"));
        neptuneMoons.add(new StringBuilder("Neso"));
        neptuneMoons.add(new StringBuilder("Proteus"));
        neptuneMoons.add(new StringBuilder("Psamathe"));
        neptuneMoons.add(new StringBuilder("Sao"));
        neptuneMoons.add(new StringBuilder("Thalassa"));
        moonsByPlanet.put("Neptune", neptuneMoons);

        HashSet<StringBuilder> plutoMoons = new HashSet<>();
        plutoMoons.add(new StringBuilder("Charon"));
        plutoMoons.add(new StringBuilder("Nix"));
        plutoMoons.add(new StringBuilder("Hydra"));
        plutoMoons.add(new StringBuilder("Kerberos"));
        plutoMoons.add(new StringBuilder("Styx"));
        moonsByPlanet.put("Pluto", plutoMoons);

        // This For loop makes it so the output will display the moons above into list under each planet group.
        for (String planet : moonsByPlanet.keySet()) {
            System.out.println("Moons of " + planet + ":");
            for (StringBuilder moon : moonsByPlanet.get(planet)) {
                System.out.println(" - " + moon);
            }
            
        }
    }
}

 */