package braums;

import java.util.Hashtable;

public class Orders {
	
	Hashtable<String, Integer> orders; 
	
	public Orders()
	{
		orders = new Hashtable<String, Integer>();
	}
	
	public void addOrder(String custName)
	{
		orders.put(custName, 1);
	}
}
