package threadcreation;

public class NamePrinter extends Thread {

	String[] names = new String[3];
	
	public NamePrinter()
	{
		names[0] = "Anuj";
		names[1] = "Neil";
		names[2] = "Parth";
	}
	
	public void run()
	{
		for(int k=0; k<3; k++)
		{
			System.out.println(names[k]);
		}
	}
}
