
	package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.IPersonCheckServices;
import Entities.Customer;


public class StarbucksCustomerManager extends BaseCustomerManager{
	

	public IPersonCheckServices _IPersonCheckServices;
	
public StarbucksCustomerManager(IPersonCheckServices _IPersonCheckServices) {
		
		this._IPersonCheckServices = _IPersonCheckServices;
		}
	public void save(Customer customer) {
		
		if(_IPersonCheckServices.checkIfRealPerson(customer) == true) {
			
			super.save(customer);
			
		} else {
			MernisException.mernisException();
			
			
		}
		
		
		
		
	}
	
	
	
}
