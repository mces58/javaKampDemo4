
public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private ICustomerCheckSevice checkSevice;
	
    public StarbucksCustomerManager(ICustomerCheckSevice checkSevice) {
		this.checkSevice = checkSevice;
    	
	}
	
	@Override
	public void save(Customer customer) {
		
		if(checkSevice.CheckRealPerson(customer)) {
			
			System.out.println("veri taban�na kaydedildi. "+customer.getFirstName());
			
		}
		
		else {
			
			System.out.println("Gecersiz ki�i kayd�");
		}
	

	}

}
