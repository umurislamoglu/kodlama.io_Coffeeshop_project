package Concrete;

import Abstract.IPersonCheckServices;
import Entities.Customer;

public class CustomerCheckManager implements IPersonCheckServices  {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		return true;
	}



}
