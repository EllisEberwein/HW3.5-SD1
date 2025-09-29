
import java.util.Scanner; // Importing our scanner, so we can create inputs into the console later
class Debug3 { // Create the class
    public static void main(String[] args) { // Setup print 
        Scanner sc = new Scanner(System.in);// Setup scanner as sc
        System.out.println("Enter your yearly salary"); // Ask the user for their salary
        int salary = sc.nextInt(); // The user will be able to input a number into the terminal here
        System.out.println("Enter your yearly expenses"); // Ask for yearly expenses
        int expenses = sc.nextInt(); // User will be able to input their salary into the terminal here
        System.out.println("Enter the amount of people in your household"); // Asking the user for the number of people in the household
        int people = sc.nextInt(); // User will be able to input their number of people in the terminal here

        int additionalTaxReduction = 0; // Initialize the variable; additionalTaxReduction as 0, it will get added to in the loop
        for(int i = 0; i <= people; i++){ // for loop starting at 0, going until the number of people, and incrementing i by 1
            additionalTaxReduction += 2; // adding to the AdditionalTaxReduction variable for each person that was input
        }

        int taxReduction = 0; // initialize the tax reduction variable
        taxReduction += additionalTaxReduction; // add additionalTaxReduction to TaxReduction
        if(salary > 50000 && people > 3){ // if statement, if salary is above 50000, and there are more than 3 people then...
            taxReduction += 10; //add 10 to TaxReduction
            System.out.println("You get a " + taxReduction+ "% reduction on taxes."); // print out total tax reduction
        } else if(salary > 30000 && people > 4){ // else if salary is above 30000, and there are more than 4 people then...
            taxReduction += 9; // add 9 to TaxReduction
            System.out.println("You get a " + taxReduction+ "% reduction on taxes."); // print out total tax reduction
        } else if(salary > 70000 && people > 2){ // else if salary is above 70000, and there are more than 2 people then...
            taxReduction += 5; // add 5 to TaxReduction
            System.out.println("You get a " + taxReduction+ "% reduction on taxes."); // print out total tax reduction
        } else {
            System.out.println("No applicable reduction on taxes found."); // print out, "No tax breaks for you ): "
        }

    }
}