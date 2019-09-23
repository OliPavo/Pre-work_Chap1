import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Chap1Function {

    public static void main(String[] args) {
        // Stores the user's input
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("Please enter an integer to evaluate or type 'quit' to end:");
            String answer = input.nextLine();
            // Checks if user entered 'quit'
            if(answer.equals("quit")) {
                break;
            }
            // Checks if user entered an integer
            try{
                int number = Integer.parseInt(answer);
                int [] output;

                output = simpleMethod(number);
                System.out.println("Here's your output: " + Arrays.toString(output));
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please try again.");
            }
        }

    }
    // Evaluates the input as specified by the given algorithm
    public static int [] simpleMethod(int number){
        ArrayList<Integer> outputs = new ArrayList<>();
        outputs.add(number);
        
        do {
            boolean isEven;
            // Checks if integer is even 
            if (number % 2 == 0) {
                isEven = true;
            } else {
                isEven = false;
            }
            // Evaluates integer and returns number for output
            if (number <= 1) {
            } else if (isEven) {
                number = number / 2;
            } else {
                number = (number * 3) + 1;
            }
            outputs.add(number);
        }while(!(number <= 1));
        //Converts the interger arrayList to an integer array
        int[] outputArray = outputs.stream().mapToInt(i -> i).toArray();
        return outputArray;
    }
}
