/*Alex Zhou
 *9-4-17
 *This is the runner for the calculate library. It is used to test the methods in Calculate.
 */
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(5));
		System.out.println(Calculate.cube(5));
		System.out.println(Calculate.average(5,5));
		System.out.println(Calculate.average(5,5,5));
		System.out.println(Calculate.toDegrees(10));
		System.out.println(Calculate.toRadians(10));
		System.out.println(Calculate.discriminant(2,5,2));
		System.out.println(Calculate.toImproperFrace(3,1,2));
		System.out.println(Calculate.toMixedNum(7,2));
		System.out.println(Calculate.foil(2,3,6,-7, "n"));
		System.out.println(Calculate.isDivisibleBy(8 ,4));
		System.out.println(Calculate.absValue(-8));
		System.out.println(Calculate.max(8,7));
		System.out.println(Calculate.max(9,9,9));
		System.out.println(Calculate.min(9,2));
		System.out.println(Calculate.round2(9.02123123));
		System.out.println(Calculate.exponent(2, 3));
		System.out.println(Calculate.factorial(5));
		System.out.println(Calculate.isPrime(2));
		System.out.println(Calculate.gcf(24,6));
		System.out.println(Calculate.sqrt(49));
		System.out.println(Calculate.quadForm(1,0, -4));
	}

}
