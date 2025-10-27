import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Demonstrates reading Policy objects from a file and displaying their details.
 */
public class PolicyDemo {
    public static void main(String[] args) {
        ArrayList<Policy> policies = new ArrayList<>();
        int smokerCount = 0;
        int nonSmokerCount = 0;

        try {
            File file = new File("PolicyInformation.txt");
            Scanner inputFile = new Scanner(file);

            // Read until the end of file
            while (inputFile.hasNext()) {
                String policyNumber = inputFile.nextLine();
                String providerName = inputFile.nextLine();
                String firstName = inputFile.nextLine();
                String lastName = inputFile.nextLine();
                int age = Integer.parseInt(inputFile.nextLine());
                String smokingStatus = inputFile.nextLine();
                double height = Double.parseDouble(inputFile.nextLine());
                double weight = Double.parseDouble(inputFile.nextLine());

                Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
                policies.add(policy);
            }
            inputFile.close();

            // Display policy information
            for (Policy p : policies) {
                System.out.println("Policy Number: " + p.getPolicyNumber());
                System.out.println("Provider Name: " + p.getProviderName());
                System.out.println("Policyholder's First Name: " + p.getPolicyHolderFirstName());
                System.out.println("Policyholder's Last Name: " + p.getPolicyHolderLastName());
                System.out.println("Policyholder's Age: " + p.getPolicyHolderAge());
                System.out.println("Policyholder's Smoking Status (smoker/non-smoker): " + p.getPolicyHolderSmokingStatus());
                System.out.println("Policyholder's Height: " + p.getPolicyHolderHeight() + " inches");
                System.out.println("Policyholder's Weight: " + p.getPolicyHolderWeight() + " pounds");
                System.out.printf("Policyholder's BMI: %.2f%n", p.calculateBMI());
                System.out.printf("Policy Price: $%.2f%n%n", p.calculatePolicyPrice());

                if (p.getPolicyHolderSmokingStatus().equalsIgnoreCase("smoker")) {
                    smokerCount++;
                } else {
                    nonSmokerCount++;
                }
            }

            System.out.println("The number of policies with a smoker is: " + smokerCount);
            System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }
}
