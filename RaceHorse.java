// Name: Tambir Ahmed
// Number: A01180474

// RaceHorse class is a subclass of Horse
public class RaceHorse extends Horse {
    
    // Additional field to hold the number of races the horse has participated in
    private int numberOfRaces;

    // Constructor to initialize the RaceHorse object with name, color, birth year, and number of races
    public RaceHorse(String name, String color, int birthYear, int numberOfRaces) {
        // Call the superclass (Horse) constructor to initialize the inherited fields
        super(name, color, birthYear);
        this.numberOfRaces = numberOfRaces;
    }

    // Getter method to get the number of races the horse has participated in
    public int getNumberOfRaces() {
        return numberOfRaces;
    }

    // Setter method to set the number of races the horse has participated in
    public void setNumberOfRaces(int numberOfRaces) {
        this.numberOfRaces = numberOfRaces;
    }
}
