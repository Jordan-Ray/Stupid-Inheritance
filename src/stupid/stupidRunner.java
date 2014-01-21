package stupid;

public class stupidRunner
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		dumb lloyd = new dumb();
		dumber harry = new dumber();
		Dumbest george = new Dumbest();
		
		System.out.println("lets test inheritance!");

		System.out.println("lloyd is dumb and his blerg is; " + lloyd.getBlerg());
		System.out.println("harry is dumber and his blerg is; " + harry.getBlerg());
		System.out.println("lets test more inheritance!");
		harry.setBlerg(45);
		System.out.println("harry is dumber and his blerg is ;" + harry.getBlerg());
		System.out.println("harry's car:" + harry.getMyCar());
		System.out.println("georg's car: " + george.getMyCar());
	}

}
