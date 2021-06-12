
public class ShipmentData {

	CustomerManager customerManager
	
	public void IDsearch(int id) {
	
		customer = customerManager;
		Customer customer = customerManager.search(id);
		
		if(customer.getId().equals(id))
		{
			int ID = customer.getId();
			String Name = customer.getName();
			String PhoneNum = customer.getPhoneNum();
			String address = customer.getAddress();
		}
		
		else
		{
			System.out.println("Wrong ID");
		}
	}

}
