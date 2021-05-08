package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.IPersonCheckServices;
import Entities.Customer;



public class NeroCustomerManager extends BaseCustomerManager {

	public IPersonCheckServices _IPersonCheckServices;
	@Override
	public void save(Customer customer) {
		if(_IPersonCheckServices.checkIfRealPerson(customer) == true) {
			
			super.save(customer);
			
		} else {
			MernisException.mernisException();
			
			
		}
	}
	

}


