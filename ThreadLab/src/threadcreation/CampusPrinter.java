package threadcreation;

public class CampusPrinter implements Runnable {

	String[] campuses = new String[3];
	
	public CampusPrinter()
	{
		campuses[0] = "Innovations";
		campuses[1] = "WHQ";
		campuses[2] = "Continuus";
	}
	
	@Override
	public void run() {
		for(int k=0; k<campuses.length; k++)
		{
			System.out.println(campuses[k]);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
