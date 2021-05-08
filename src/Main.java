import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Entities.Customer;
import Concrete.StarbucksCustomerManager;
import Adapters.MernisServiceAdapter;

public class Main {

	public static void main(String[] args) throws Exception {
		
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		Customer person = new Customer();
		person.setId(1);
		person.setFirstName("Umur");
		person.setLastName("Ýslamoðlu");
		person.setBirthday(LocalDate.of(1992,9,25));
		person.setNationalId("00000000000");
		
		baseCustomerManager.save(person);
	}

}
