// Name: Tambir Ahmed
// Number: A01180474

// Class definition for Horse
public class Horse {

    // Data fields (attributes) for the horse's name, color, and birth year
    private String name;
    private String color;
    private int birthYear;

    // Constructor to initialize the Horse object with name, color, and birth year
    public Horse(String name, String color, int birthYear) {
        this.name = name;
        this.color = color;
        this.birthYear = birthYear;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Getter and Setter for birth year
    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    // Main method for testing the Horse class (optional)
    public static void main(String[] args) {
        // Create a Horse object
        Horse myHorse = new Horse("Blazing", "Brown", 2019);

        // Access and print the horse's details using getter methods
        System.out.println("Horse Name: " + myHorse.getName());
        System.out.println("Horse Color: " + myHorse.getColor());
        System.out.println("Horse Birth Year: " + myHorse.getBirthYear());

        // Modify the horse's color using setter method
        myHorse.setColor("Brown");

        // Print the updated details
        System.out.println("Updated Horse Color: " + myHorse.getColor());
    }
}
