import java.util.*;


public class CarModels {
    public static void main (String[] args) {
        //Hashmap
        HashMap <String, String> vehicles = new HashMap<>();

        //Scanner
        Scanner userIn = new Scanner(System.in);

        //Add cars to HashMap
        vehicles.put("Civic", "Honda");
        vehicles.put("Accord", "Honda");
        vehicles.put("Corolla", "Toyota");
        vehicles.put("F-150", "Ford");
        //Prompting the user.
        System.out.print("What car model are you looking for? ");
        String model = userIn.nextLine();
        //Checking if model is avail.
        if (vehicles.containsKey(model)){
            String make = vehicles.get(model);
            System.out.println("Oh, you're looking for a " + model + "? Our" + make + " selection is right over here...");
        } else {
            System.out.println("Sorry we don't have that car model available.");
        }

    }
}
