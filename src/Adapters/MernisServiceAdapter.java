package Adapters;


import java.rmi.RemoteException;

import Abstract.IPersonCheckServices;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IPersonCheckServices{


	@Override
	public boolean checkIfRealPerson(Customer customer) {
	boolean result;
		
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		
		try { 
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(
					Long.parseLong(customer.getNationalId()), 
					customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(),
					customer.getBirthday().getYear());
					
		}
		catch(RemoteException e) {
			result = false;
			e.printStackTrace();
		}
		
		return result;
		

	}
	}