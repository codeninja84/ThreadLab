package threadcreation;

public class ThreadCreator {
	public static void main(String[] args)
	{
		NamePrinter np = new NamePrinter();
		CampusPrinter cp = new CampusPrinter();
		cp.run();
		np.run();
	}
}
