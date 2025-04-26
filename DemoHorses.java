import java.util.Scanner;

// Name: Tambir Ahmed
// Number: A01180474

// Demo application to test Horse and RaceHorse classes
public class DemoHorses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for Horse details
        System.out.println("Enter details for Horse:");
        System.out.print("Name: ");
        String horseName = scanner.nextLine();
        System.out.print("Color: ");
        String horseColor = scanner.nextLine();
        System.out.print("Birth Year: ");
        int horseBirthYear = scanner.nextInt();
        scanner.nextLine(); // Consume the newline left after nextInt()

        // Create a Horse object using the user input
        Horse myHorse = new Horse(horseName, horseColor, horseBirthYear);

        // Display Horse information
        System.out.println("\nHorse Information:");
        System.out.println("Name: " + myHorse.getName());
        System.out.println("Color: " + myHorse.getColor());
        System.out.println("Birth Year: " + myHorse.getBirthYear());

        // Prompt for RaceHorse details
        System.out.println("\nEnter details for RaceHorse:");
        System.out.print("Name: ");
        String raceHorseName = scanner.nextLine();
        System.out.print("Color: ");
        String raceHorseColor = scanner.nextLine();
        System.out.print("Birth Year: ");
        int raceHorseBirthYear = scanner.nextInt();
        System.out.print("Number of Races: ");
        int numberOfRaces = scanner.nextInt();

        // Create a RaceHorse object using the user input
        RaceHorse myRaceHorse = new RaceHorse(raceHorseName, raceHorseColor, raceHorseBirthYear, numberOfRaces);

        // Display RaceHorse information
        System.out.println("\nRaceHorse Information:");
        System.out.println("Name: " + myRaceHorse.getName());
        System.out.println("Color: " + myRaceHorse.getColor());
        System.out.println("Birth Year: " + myRaceHorse.getBirthYear());
        System.out.println("Number of Races: " + myRaceHorse.getNumberOfRaces());

        // Close the scanner
        scanner.close();
    }
}
