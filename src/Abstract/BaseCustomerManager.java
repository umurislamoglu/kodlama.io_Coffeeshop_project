	package Abstract;

import Entities.Customer;

public class BaseCustomerManager implements ICustomerServices {

	public void save(Customer customer) {
		System.out.println("Saved to DB :" + customer.getFirstName());
		
	}

}
