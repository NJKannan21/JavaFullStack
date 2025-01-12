package guviPortalTask4;

public class Voter {
	
	private int voterId;
    private String name;
    private int age;

    // Parameterized constructor
    public Voter(int voterId, String name, int age) throws InvalidAgeForVoterException {
        if (age < 18) {
            throw new InvalidAgeForVoterException("Age " + age + " is invalid for a voter. Minimum age required is 18.");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    // Display voter details
    public void display() {
        System.out.println("Voter Details:");
        System.out.println("Voter ID: " + voterId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            // Test Case 1: Valid Voter
            Voter voter1 = new Voter(101, "John Doe", 25);
            voter1.display();

            // Test Case 2: Invalid Voter Age
            Voter voter2 = new Voter(102, "Alice", 16);
            voter2.display();
        } catch (InvalidAgeForVoterException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            // Test Case 3: Another Valid Voter
            Voter voter3 = new Voter(103, "Bob", 30);
            voter3.display();
        } catch (InvalidAgeForVoterException e) {
            System.out.println("Exception: " + e.getMessage());
        }
	}

}
