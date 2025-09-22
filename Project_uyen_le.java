 import java.util.Scanner;

public class Project_uyen_le {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the Policy Number: ");
        String policyNumber = input.nextLine();

        System.out.print("Please enter the Provider Name: ");
        String providerName = input.nextLine();

        System.out.print("Please enter the Policyholder’s First Name: ");
        String firstName = input.nextLine();

        System.out.print("Please enter the Policyholder’s Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Please enter the Policyholder’s Age: ");
        int age = input.nextInt();
        input.nextLine(); 

        System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
        String smokingStatus = input.nextLine();

        System.out.print("Please enter the Policyholder’s Height (in inches): ");
        double height = input.nextDouble();

        System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
        double weight = input.nextDouble();

        Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);

        System.out.println("\nPolicy Number: " + policy.getPolicyNumber());
        System.out.println("Provider Name: " + policy.getProviderName());
        System.out.println("Policyholder’s First Name: " + policy.getPolicyHolderFirstName());
        System.out.println("Policyholder’s Last Name: " + policy.getPolicyHolderLastName());
        System.out.println("Policyholder’s Age: " + policy.getPolicyHolderAge());
        System.out.println("Policyholder’s Smoking Status: " + policy.getPolicyHolderSmokingStatus());
        System.out.println("Policyholder’s Height: " + policy.getPolicyHolderHeight() + " inches");
        System.out.println("Policyholder’s Weight: " + policy.getPolicyHolderWeight() + " pounds");
        System.out.printf("Policyholder’s BMI: %.2f%n", policy.calculateBMI());
        System.out.printf("Policy Price: $%.2f%n", policy.calculatePolicyPrice());
    }
}
