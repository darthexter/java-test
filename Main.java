class Main {

	public static void main(String[] args) {
		String[] custInfo = Customer.customer_input();
		Customer c1 = new Customer(custInfo[0],custInfo[1],custInfo[2],custInfo[3]);
		System.out.println("Customer details as below: ");
		System.out.println(c1.custUuid);
		System.out.println(c1.custFname);
		System.out.println(c1.custLname);
	}
}