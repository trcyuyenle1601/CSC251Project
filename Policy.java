public class Policy {
    private String policyNumber;
    private String providerName;
    private String policyHolderFirstName;
    private String policyHolderLastName;
    private int policyHolderAge;
    private String policyHolderSmokingStatus;
    private double policyHolderHeight; // in inches
    private double policyHolderWeight; // in pounds

      public Policy() {
        policyNumber = "";
        providerName = "";
        policyHolderFirstName = "";
        policyHolderLastName = "";
        policyHolderAge = 0;
        policyHolderSmokingStatus = "non-smoker";
        policyHolderHeight = 0.0;
        policyHolderWeight = 0.0;
    }

    public Policy(String policyNumber, String providerName, String firstName, String lastName,
                  int age, String smokingStatus, double height, double weight) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyHolderFirstName = firstName;
        this.policyHolderLastName = lastName;
        this.policyHolderAge = age;
        this.policyHolderSmokingStatus = smokingStatus;
        this.policyHolderHeight = height;
        this.policyHolderWeight = weight;
    }

    public String getPolicyNumber() { return policyNumber; }
    public void setPolicyNumber(String policyNumber) { this.policyNumber = policyNumber; }

    public String getProviderName() { return providerName; }
    public void setProviderName(String providerName) { this.providerName = providerName; }

    public String getPolicyHolderFirstName() { return policyHolderFirstName; }
    public void setPolicyHolderFirstName(String policyHolderFirstName) { this.policyHolderFirstName = policyHolderFirstName; }

    public String getPolicyHolderLastName() { return policyHolderLastName; }
    public void setPolicyHolderLastName(String policyHolderLastName) { this.policyHolderLastName = policyHolderLastName; }

    public int getPolicyHolderAge() { return policyHolderAge; }
    public void setPolicyHolderAge(int policyHolderAge) { this.policyHolderAge = policyHolderAge; }

    public String getPolicyHolderSmokingStatus() { return policyHolderSmokingStatus; }
    public void setPolicyHolderSmokingStatus(String policyHolderSmokingStatus) { this.policyHolderSmokingStatus = policyHolderSmokingStatus; }

    public double getPolicyHolderHeight() { return policyHolderHeight; }
    public void setPolicyHolderHeight(double policyHolderHeight) { this.policyHolderHeight = policyHolderHeight; }

    public double getPolicyHolderWeight() { return policyHolderWeight; }
    public void setPolicyHolderWeight(double policyHolderWeight) { this.policyHolderWeight = policyHolderWeight; }

    // Calculate BMI
    public double calculateBMI() {
        if (policyHolderHeight == 0) return 0; // avoid division by zero
        return (policyHolderWeight * 703) / (policyHolderHeight * policyHolderHeight);
    }

    // Calculate Policy Price
    public double calculatePolicyPrice() {
        double price = 600.0; // base fee

        if (policyHolderAge > 50) {
            price += 75.0;
        }
        if (policyHolderSmokingStatus.equalsIgnoreCase("smoker")) {
            price += 100.0;
        }
        double bmi = calculateBMI();
        if (bmi > 35) {
            price += (bmi - 35) * 20;
        }
        return price;
    }
}
