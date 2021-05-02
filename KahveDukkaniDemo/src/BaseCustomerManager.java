
public abstract class BaseCustomerManager implements ICustomerService{

	@Override
	public void save(Customer customer) {
	
	System.out.println("Veri tabanina eklendi: " + customer.getFirstName());	
	}

}
