package braums;

import java.util.Hashtable;

public class Orders {
	
	Hashtable<String, Integer> orders; 
	
	public Orders()
	{
		orders = new Hashtable<String, Integer>();
	}
	
	public synchronized void addOrder(String custName)
	{
		orders.put(custName, 1);
	}

	public synchronized void completed(String custName)
	{
		
	}
	
	public synchronized void picking()
	{
		
	}
	
	public synchronized void serving()
	{
		
	}
}
