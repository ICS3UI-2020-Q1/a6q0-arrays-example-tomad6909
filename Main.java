import java.util.Scanner;
/**
 * This program is an array example
 * @author David Toma
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create scanner for user input
    Scanner input = new Scanner(System.in);
    
   // create an array with 5 spots
  double[] grades = new double[5];

  // put grades into array using a loop
  for(int i = 0; i < 5; i++){
    System.out.println("Please enter in grade " + (i + 1));
  grades[i] = input.nextDouble();
  }

  // create a variable to store the sum
  double sum = 0;

  // use a for loop to go through the array and add to the sum
  for(int i = 0; i < grades.length; i++){
    // add the grade to sum
    sum = sum + grades[i];
  }

  // determine the average
  double average = sum / 5;

  // let the user know
  System.out.println("Your average mark is " + average);

  System.out.println(grades);

  }
}
