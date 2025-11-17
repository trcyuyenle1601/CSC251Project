public class Policy
{
    private String policyNumber;
    private String providerName;
    private PolicyHolder policyHolder;

    private static int policyCount = 0;

    
    public Policy()
    {
        this.policyNumber = "";
        this.providerName = "";
        this.policyHolder = new PolicyHolder();
        policyCount++;
    }

    
    public Policy(String policyNumber, String providerName, PolicyHolder holder)
    {
        this.policyNumber = policyNumber;
        this.providerName = providerName;

        
        this.policyHolder = new PolicyHolder(holder);

        policyCount++;
    }

    
    public Policy(Policy other)
    {
        this.policyNumber = other.policyNumber;
        this.providerName = other.providerName;
        this.policyHolder = new PolicyHolder(other.policyHolder);

        policyCount++;
    }

    public String getPolicyNumber() { return policyNumber; }
    public String getProviderName() { return providerName; }

    
    public PolicyHolder getPolicyHolder()
    {
        return new PolicyHolder(policyHolder);
    }

    public static int getPolicyCount() { return policyCount; }

    
    public double calculateBMI()
    {
        return policyHolder.getBMI();
    }

    
    public double calculatePolicyPrice()
    {
        double price = 600.0;

        if (policyHolder.getAge() > 50)
            price += 75.0;

        if (policyHolder.getSmokingStatus().equalsIgnoreCase("Y") ||
            policyHolder.getSmokingStatus().equalsIgnoreCase("smoker"))
            price += 100.0;

        double bmi = policyHolder.getBMI();
        if (bmi > 35)
            price += (bmi - 35) * 20;

        return price;
    }

    
    public String toString()
    {
        return "Policy Number: " + policyNumber +
               "\nProvider Name: " + providerName +
               "\n" + policyHolder.toString() +
               String.format("\nPolicy Price: $%.2f", calculatePolicyPrice());
    }
}
