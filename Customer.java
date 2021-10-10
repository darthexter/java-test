import java.util.UUID;

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
}