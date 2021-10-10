import java.util.UUID;
import java.util.Scanner;

public class Customer {

	UUID custUuid;
	String custFname, custLname, custPhone, custEmail;

	public Customer(String fname, String lname, String phone, String email) {
		custUuid = UUID.randomUUID();
		custFname = fname;
		custLname = lname;
		custPhone = phone;
		custEmail = email;
	}

	public static String[] customer_input() {
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
}