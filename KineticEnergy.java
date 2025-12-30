import java.util.Scanner; //Import the Scanner class
//from java.util package
//because we're acquiring inputs from user
public class KineticEnergy
{
    //Method to calculate kinetic energy
    //Method type: Processor
    //Declaring variable 'mass' and 'velocity' for user inputs
    public static double calculateKineticEnergy(double mass, double velocity)
    {
        //Formula to calculate kinetic energy
        // KE = (1/2)*m*(v^2)
        //KE is kinetic energy, m is mass (in kg), v is velocity (in m/s)
        return 0.5 * mass * Math.pow(velocity,2);
    }
    
    //Main method
    public static void main(String[] args)
    {
        //create a Scanner object
        //to be used to obtain input
        /*scanner object is used in main method*/
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter object's mass (in kg):");
        double mass = scanner.nextDouble();
        System.out.println ("Enter object's velocity (in ms^-1):");
        double velocity = scanner.nextDouble();
        
        //Calculate kinetic energy for the mass and velocity given
        //Calling the Processor method
        double KE = calculateKineticEnergy(mass, velocity);
        
        //Printing kinetic energy, KE, value resulting from calculation
        System.out.println("The Kinetic Energy for the given mass and velocity is: " + KE + " joules");
        
        scanner.close(); //closing Scanner object
    }
}
