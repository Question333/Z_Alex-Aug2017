
/*Alex Zhou
 *9-29-17
 *2nd period
 *Our self written math library
 *it contains a series of methods to do basic math functions.
 */
public class Calculate {
	//part 1
    //takes a integer input and returns squared integer
    public static int square (int operand)
    {
        return operand * operand; 
    }
    //takes a inputed integer and returns the cubed integer
    public static int cube (int operand)
    {
        return operand * operand * operand; 
    }
    //averages two double inputs and returns the average in a double
    public static double average (double number1, double number2)
    {
        return (number1+number2)/2;
    }
    //takes three doubles inputs and returns the average of the three with a double
    public static double average (double number1, double number2, double number3)
    {
        return (number1+ number2+ number3)/3;
    }
    //converts inputed double radians into double degrees
    public static double toDegrees (double radian)
    {
        return (radian*180)/3.14159;
    }
    //converts input double degrees into double radians
    public static double toRadians (double degree)
    {
        return (degree*3.14159)/180;
    }
    //takes three doubles and returns a double discriminat of the three numbers
    public static double discriminant (double a, double b, double c)
    {
        
        return (b*b) - (4 * a *c);      
    }
    //takes three integers and converts the integers of the mixed number into a String of the improper fracation
    //returns String of improper fracation
    public static String toImproperFrac (int wholeNumber, int numerator, int denominator)
    {
        String mixedNumber; 
        int top = (wholeNumber *  denominator) + numerator ;
        int bottom = denominator;
        mixedNumber = top + "/" + bottom;
        return mixedNumber;
    }
    //takes two integers of the improper fraction and converts it into a mixed number
    //returns Mixed number in a String
    public static String toMixedNum (int numerator, int denominator)
    {
        String improperFrac;
        int wholeNumber = numerator/denominator;
        int numerator1 =  numerator- wholeNumber*denominator;
        improperFrac = wholeNumber + "_" + numerator1 + "/" + denominator; 
        return improperFrac;
    }
    //takes 4 integers(a,b,c,d) and a String
    //does binomial multiplication and returns it in a quadratic equation
    public static String foil (int a, int b, int c, int d, String variable) 
    {
        String binomialMultiplication;
        int firstPart = a * c;
        int secondPart = a * d + c* b;
        int lastPart = b* d; 
         binomialMultiplication = firstPart + variable + "^2" + "+" + secondPart + variable + "+" + lastPart;
         return  binomialMultiplication;
    }
    //part 2
    //accepts two integers and determines whether or not one integer is evenly divisible by another
    public static boolean isDivisibleBy (int integer1, int integer2)
    {
    	if (integer2==0)
    		throw new IllegalArgumentException("Can not divide by zero" + integer2);
        return integer1% integer2==0;
    
    }
    //accepts a double and returns the absolute value of it
    public static double absValue (double number)
    {
        if(number>0) return number;
        else { return number*-1; } 
    }
    //finds the biggest number of two inputed double numbers and returns it
    public static double max (double number1, double number2)
    {
        if (number1>number2)
        {
            return number1;
        }
        else (number1<number2)
        {
            return number2;
        }
            }
    //takes three inputted double numbers and returns the biggest number in a double
    public static double max (double number1, double number2, double number3)
    {
        if (number1>number2)
        {
            if (number1>number3)
                {
            	return number1;
            	}
            else
            {
                return number3;
            }
        }
        if (number1<number2)
        {
            if (number2<number3)
            {
                return number2;
            }
            else 
            {
                return number3;
            }
        }
        if (number1==number3)
        {
            return number1;
        }
        if (number1<number3)
        {
        	return number3;
        }
        else 
        	return number1;
        
    }
    //takes two int numbers
    //returns the smallest int number
    public static int min ( int integer1, int integer2)
    {
        if (integer1<integer2)
        {
            return integer1;
        }
        if (integer1>integer2)
        {
            return integer2;
        }
        return integer2; 
        
    }
    //rounds a double number input and reuturns it into two decimal places
    public static double round2(double number)
    {
    	double result = 0.0;
    		
    	int tempInt = (int)(number * 1000);
    	int roundNum = tempInt % 10;
    	tempInt = tempInt / 10;
    	if (roundNum >= 5 && tempInt > 0)
    		tempInt++;
    	else if(roundNum <= -5 && tempInt < 0)
    		tempInt--;
    	result = tempInt / 100.0;
    	return result;
    }
    //part 3
    //Takes a double and a int
    //returns the raised double number by the inputed int
    
    public static double exponent (double number, int power)
    {
    	if(power<0)
    		throw new IllegalArgumentException("Code does not take negative power:" + power);
        for(int x=1; x<power; x=x+1) {
        
        double times = number;
        number=number* times; }
        return number;
    }
    //takes a int input and returns factorial of integer
    public static int factorial (int integer1)
    {
    	if (integer1<0)
    		throw new IllegalArgumentException("negative integer:" + integer1);
        int x = 1;
        while(integer1>0) {
            x = integer1 *x;
            integer1--;
        }
        return x;   
    }
    //takes a inputed int number
    //returns a boolean to tell if it is prime or not
	public static boolean isPrime (int integer1)
    {
        for(int i =2; i<integer1;) {
            if (isDivisibleBy(integer1,i));
            return true;
        }
        return false;
    }
    //finds the greatest common factor of two inputed int numbers and returns the value
    public static int gcf ( int number1, int number2) {
       if (number2== 0)
       return number1;
       if (isDivisibleBy(number1,number2))
       return number2;
       else 
        return gcf(number2, number1 % number2);
        }
    //takes a double and returns the squared double
    public static double sqrt (double integer1){
    	double t;
    	double squareroot = integer1/2;
    	do{
    		t = squareroot;
    		squareroot = (t + (integer1/t))/2;
    	}while ((t - squareroot) !=0);
    	return squareroot;
    }
    //Takes three integer that are coefficients of a quadratic equatino in standard form
    //Uses the quadratic formula to find the foots of the quadratic equation and reurns a string with the roots if any
    public static String quadForm (int a, int b, int c) {
    	if (discriminant(a,b,c)<0)
    	throw new IllegalArgumentException("No real roots");
    	
    	double oneRoot = (-b + (sqrt(discriminant(a,b,c))))/(a*2.0);
    	double twoRoot = (-b - (sqrt(discriminant(a,b,c))))/(a*2.0);
     
    	if (oneRoot==twoRoot) {
    			
    			 String name = "" + twoRoot;
    			 return name;
    	}
    	if (oneRoot<twoRoot) {
    		String answer = oneRoot + " and " + twoRoot;
    		return answer;
    	} else {
    		String answer2 = twoRoot + " and " + oneRoot;
    		return answer2;
		} 
    	
    }
        
}
    
