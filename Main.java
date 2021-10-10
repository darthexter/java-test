import java.util.Scanner;

class Main {

	static String[] customer_input() {
		Scanner custInSc = new Scanner(System.in);
		String[] custIn = new String[4];

		System.out.println("Please enter Customer data: \n");

		System.out.print("Enter the First Name: ");
		custIn[0] = custInSc.nextLine();

		System.out.print("Enter the Last Name: ");
		custIn[1] = custInSc.nextLine();

		System.out.print("Enter the Phone number: ");
		custIn[2] = custInSc.nextLine();

		System.out.print("Enter the Email Address: ");
		custIn[3] = custInSc.nextLine();

		System.out.println("Information Entered Successfully.\n");

		return custIn;
	}

	public static void main(String[] args) {
		String[] custInfo = customer_input();
		Customer c1 = new Customer(custInfo[0],custInfo[1],custInfo[2],custInfo[3]);

		// Customer c1 = new Customer("John","Doe","408-123-4567","john.doe@example.com");
		System.out.println(c1.custUuid);
		System.out.println(c1.custFname);
		System.out.println(c1.custLname);
	}
}