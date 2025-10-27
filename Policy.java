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
    
    /** 
    *Constructs a Policy object with the specified values 
    *@param policyNumber the policy number
     * @param providerName the provider name
     * @param firstName the policyholder's first name
     * @param lastName the policyholder's last name
     * @param age the policyholder's age
     * @param smokingStatus the policyholder's smoking status ("smoker" or "non-smoker")
     * @param height the policyholder's height in inches
     * @param weight the policyholder's weight in pounds
     */

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

   /** @return the policy number */
    public String getPolicyNumber() { return policyNumber; }
    
   /** @param policyNumber sets the policy number */ 
    public void setPolicyNumber(String policyNumber) { this.policyNumber = policyNumber; }

   /** @return the provider name   */
    public String getProviderName() { return providerName; }
    
   /** @param providerName sets the provider name */ 
    public void setProviderName(String providerName) { this.providerName = providerName; }

   /** @return the policyholder's first name */
    public String getPolicyHolderFirstName() { return policyHolderFirstName; }
    
   /** @param policyHolderFirstName sets the policyholder's first name */ 
    public void setPolicyHolderFirstName(String policyHolderFirstName) { this.policyHolderFirstName = policyHolderFirstName; }

   /** @return the policyholder's last name */
    public String getPolicyHolderLastName() { return policyHolderLastName; }
    
   /** @param policyHolderFirstName sets the policyholder's last name */
    public void setPolicyHolderLastName(String policyHolderLastName) { this.policyHolderLastName = policyHolderLastName; }

   /** @return the policyholder's age */
    public int getPolicyHolderAge() { return policyHolderAge; }
    
   /** @param policyHolderAge sets the policyholder's age */
    public void setPolicyHolderAge(int policyHolderAge) { this.policyHolderAge = policyHolderAge; }

   /** @return the policyholder's smoking status */
    public String getPolicyHolderSmokingStatus() { return policyHolderSmokingStatus; }
    
   /** @param policyHolderSmokingStatus sets the policyholder's smoking status */
    public void setPolicyHolderSmokingStatus(String policyHolderSmokingStatus) { this.policyHolderSmokingStatus = policyHolderSmokingStatus; }

   /** @return the policyholder's height in inches */
    public double getPolicyHolderHeight() { return policyHolderHeight; }
    
   /** @param policyHolderHeight sets the policyholder's height in inches */
    public void setPolicyHolderHeight(double policyHolderHeight) { this.policyHolderHeight = policyHolderHeight; }

   /** @return the policyholder's weight in pounds */
    public double getPolicyHolderWeight() { return policyHolderWeight; }
    
   /** @param policyHolderWeight sets the policyholder's weight in pounds */
    public void setPolicyHolderWeight(double policyHolderWeight) { this.policyHolderWeight = policyHolderWeight; }

    // Calculate BMI
    public double calculateBMI() {
        if (policyHolderHeight == 0) return 0; // avoid division by zero
        return (policyHolderWeight * 703) / (policyHolderHeight * policyHolderHeight);
    }

    // Calculate Policy Price
    /** @return the calculated policy price */
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
