
/*Alex Zhou
 *9-4-17
 *Our self written math library
 *it contains a series of methods to do basic math functions.
 */
public class Calculate {
    //square the input
    public static int square (int operand)
    {
        return operand * operand; 
    }
    //cube the input
    public static int cube (int operand)
    {
        return operand * operand * operand; 
    }
    //average two inputs
    public static double average (double number1, double number2)
    {
        return (number1+number2)/2;
    }
    //average three inputs
    public static double average (double number1, double number2, double number3)
    {
        return (number1+ number2+ number3)/3;
    }
    //converts input radians into degrees
    public static double toDegrees (double radian)
    {
        return (radian*180)/3.14159;
    }
    //converts input degrees into radians
    public static double toRadians (double degree)
    {
        return (degree*3.14159)/180;
    }
    //finds discriminat of the 3 inputs
    public static double discriminant (double a, double b, double c)
    {
        
        return (b*b) - (4 * a *c);      
    }
    //finds mixedNumber of the input 
    public static String toImproperFrace (int wholeNumber, int numerator, int denominator)
    {
        String mixedNumber; 
        int top = (wholeNumber *  denominator) + numerator ;
        int bottom = denominator;
        mixedNumber = top + "/" + bottom;
        return mixedNumber;
    }
    //finds improperFrac of the input
    public static String toMixedNum (int numerator, int denominator)
    {
        String improperFrac;
        int wholeNumber = numerator/denominator;
        int numerator1 =  numerator- wholeNumber*denominator;
        improperFrac = wholeNumber + "_" + numerator1 + "/" + denominator; 
        return improperFrac;
    }
    //finds the (ax+b)(cx+d) into a quadratic equation
    public static String foil (int a, int b, int c, int d, String n) 
    {
        String binomialMultiplication;
        int firstPart = a * c;
        int secondPart = a * d + c* b;
        int lastPart = b* d; 
         binomialMultiplication = firstPart +"n^2" + "+" + secondPart + "n" + "+" + lastPart;
         return  binomialMultiplication;
    }
    //accepts two integers and determines whether or not one integer is evenly divisible by another
    public static boolean isDivisibleBy (int integer1, int integer2)
    {
    	if (integer2==0)
    		throw new IllegalArgumentException("Can not divide by zero" + integer2);
        return integer1% integer2==0;
    
    }
    //accepts a integer and returns the absolute value of it
    public static double absValue (double integer)
    {
        if(integer>0) return integer;
        else { return integer*-1; } 
    }
    //finds the biggest number of two integer
    public static double max (double integer1, double integer2)
    {
        if (integer1>integer2)
        {
            return integer1;
        }
        if (integer1<integer2)
        {
            return integer2;
        }
                
        else 
        {
            return integer2;
        }
            }
    //finds the max of three integers
    public static double max (double integer1, double integer2, double integer3)
    {
        if (integer1>integer2)
        {
            if (integer1>integer3)
                {return integer1;}
            else
            {
                return integer3;
            }
        }
        if (integer1<integer2)
        {
            if (integer2<integer3)
            {
                return integer2;
            }
            else 
            {
                return integer3;
            }
        }
        if (integer1==integer3)
        {
            return integer1;
        }
        else 
            return integer1; 
        
    }
    //finds the smallest of two integers
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
    //rounds a double input into two decimal places
    public static double round2 ( double orig)
    {
    	double result = 0.0;
		
    	int tempInt = (int)(orig * 1000);
    	int roundNum = tempInt % 10;
    	tempInt = tempInt / 10;
    	if (roundNum >= 5 && tempInt > 0)
    		tempInt++;
    	else if(roundNum <= -5 && tempInt < 0)
    		tempInt--;
    	result = tempInt / 100.0;
    	return result;
    }
    //Multiplies an integer by the inputed power/
    public static double exponent (double integer1, int power)
    {
    	if(power<0)
    		throw new IllegalArgumentException("Code does not take negative power:" + power);
        for(int x=1; x<power; x=x+1) {
        
        double times = integer1;
        integer1=integer1* times; }
        return integer1;
    }
    //finds factorial of integer
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
    //finds if the number inputted is prime or not
    public static boolean isPrime (int integer1)
    {
        for(int i =2; i<integer1; i++) {
            if (isDivisibleBy(integer1,i));
            return true;
        }
        return false;
    }
    //finds the greatest common factor of two numbers
    public static int gcf ( int number1, int number2) {
       if (number2== 0)
       return number1;
       if (isDivisibleBy(number1,number2))
       return number2;
       else 
        return gcf(number2, number1 % number2);
        }
    //squares a number
    public static double sqrt (double number1) {
        double number2= 1;
        if (number1<0)
        throw new IllegalArgumentException("Can not square negative number: " + number1);
        while (number1 >= number2*number2) {
            number2++;
        }
        return round2(.5*(number1/number2 + number2));
    }
    public static String quadForm (int a, int b, int c) {
    	if (discriminant(a,b,c)<0)
    	throw new IllegalArgumentException("No real roots");
    	double inside= sqrt(discriminant(a,b,c));
    	double oneRoot = round2((-b + inside)/(a*2));
    	double twoRoot= round2((-b - inside)/(a*2));
    	if (oneRoot==twoRoot) {
    			 double test = round2(twoRoot);
    			 String name = "" + test;
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
    
