public class PolicyHolder
{
    
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;   
    private double height;
    private double weight;

    
    public PolicyHolder()
    {
        firstName = "";
        lastName = "";
        age = 0;
        smokingStatus = "non-smoker";
        height = 0.0;
        weight = 0.0;
    }

  
    public PolicyHolder(PolicyHolder obj)
    {
        this.firstName = obj.firstName;
        this.lastName = obj.lastName;
        this.age = obj.age;
        this.smokingStatus = obj.smokingStatus;
        this.height = obj.height;
        this.weight = obj.weight;
    }

    
    public PolicyHolder(String firstName, String lastName, int age,
                        String smokingStatus, double height, double weight)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
    }

    
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public String getSmokingStatus() { return smokingStatus; }
    public double getHeight() { return height; }
    public double getWeight() { return weight; }

    
    public double getBMI()
    {
        return (weight * 703) / (height * height);
    }

   
    public String toString()
    {
        return String.format(
            "Policyholder's First Name: %s\n" +
            "Policyholder's Last Name: %s\n" +
            "Policyholder's Age: %d\n" +
            "Policyholder's Smoking Status (Y/N): %s\n" +
            "Policyholder's Height: %.1f inches\n" +
            "Policyholder's Weight: %.1f pounds\n" +
            "Policyholder's BMI: %.2f",
            firstName, lastName, age, smokingStatus,
            height, weight, getBMI()
        );
    }
}
