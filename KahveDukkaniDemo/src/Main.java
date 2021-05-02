
public class Main {
	

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new CustomerCheckManager());
		
		Customer customer = new Customer(1,"Can","Eser","08.08.2001","123456789");
		
		customerManager.save(customer);
	}

}
