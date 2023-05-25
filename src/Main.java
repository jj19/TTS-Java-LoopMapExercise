import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Main {


    public class DataStructures {
        public static void main(String[] args) {
            // Task 1: Ask the user for 5 numbers and store them in an array list
            ArrayList<Integer> numbers = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter 5 numbers:");
            for (int i = 0; i < 5; i++) {
                int number = scanner.nextInt();
                numbers.add(number);
            }

            // Task 2: Find the sum, product, largest, and smallest of those numbers
            int sum = 0;
            int product = 1;
            int largest = numbers.get(0);
            int smallest = numbers.get(0);

            for (int number : numbers) {
                sum += number;
                product *= number;
                if (number > largest) {
                    largest = number;
                }
                if (number < smallest) {
                    smallest = number;
                }
            }

            System.out.println("Sum: " + sum);
            System.out.println("Product: " + product);
            System.out.println("Largest: " + largest);
            System.out.println("Smallest: " + smallest);

            // Task 3: Create a hash map of vehicles (model -> make)
            HashMap<String, String> vehicles = new HashMap<>();
            vehicles.put("Civic", "Honda");
            vehicles.put("Accord", "Honda");
            vehicles.put("Corolla", "Toyota");
            vehicles.put("Camry", "Toyota");
            vehicles.put("Mustang", "Ford");

            // Task 4: Ask the customer for a car model and find the make using the HashMap
            System.out.println("What car model are you looking for?");
            String model = scanner.next();

            if (vehicles.containsKey(model)) {
                String make = vehicles.get(model);
                System.out.println("Oh, you're looking for a " + model + "? Our " + make + " selection is right over here...");
            } else {
                System.out.println("Sorry, we don't have that car model in stock.");
            }
        }}}

