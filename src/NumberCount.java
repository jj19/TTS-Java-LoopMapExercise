import java.util.*;


public class NumberCount {
    public static void main(String[] args){
        //create ArrayList to store numbers
        ArrayList<Integer> numberArray = new ArrayList<>();

        //Scanner to capture user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 5 numbers:");

        //loop to ask the user for numbers
        for (int i = 0; i < 5; i++) {
            int number = scanner.nextInt();
            numberArray.add(number);
        }

        //sum, product, largest and smallest
        int sum = 0;
        int product = 1;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

    for (int number : numberArray)

    {
        sum += number;

        product *= number;

        largest = Math.max(largest, number);

        smallest = Math.min(smallest, number);
    }
    //print results
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
    }

    //loop through arraylist

}