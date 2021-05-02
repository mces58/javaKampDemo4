
public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private ICustomerCheckSevice checkSevice;
	
    public StarbucksCustomerManager(ICustomerCheckSevice checkSevice) {
		this.checkSevice = checkSevice;
    	
	}
	
	@Override
	public void save(Customer customer) {
		
		if(checkSevice.CheckRealPerson(customer)) {
			
			System.out.println("veri tabanýna kaydedildi. "+customer.getFirstName());
			
		}
		
		else {
			
			System.out.println("Gecersiz kiþi kaydý");
		}
	

	}

}
