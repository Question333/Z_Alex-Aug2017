import java.util.Scanner; 
//
//
//

public class QuadraticClient {
	public static void main(String[] args)
	{
		Scanner a1 = new Scanner(System.in);
		boolean notdone = true;
		while (notdone==true) {
			System.out.println("Welcome to the Quatratic Describer");
			System.out.println("Provide values for coefficients a, b, and c");	
			System.out.println("a: ");
			double a = a1.nextDouble();
			System.out.println("b: ");
			double b = a1.nextDouble();
			System.out.println("c: ");
			double c = a1.nextDouble();
			System.out.println(Quadratic.quadrDescriber(a,b,c));
			System.out.println("Do you want to kepp going? <Type \"quit\" to end>");
			String finished = a1.next();
			if (finished.equals("quit"))
				notdone = false;
		}
	
	}
}


