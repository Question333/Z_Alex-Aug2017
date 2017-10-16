//
//

public class Quadratic {
	 public static double discriminant (double a, double b, double c)
	    {
	        return (b*b) - (4 * a *c);      
	    }
//	 
	 public static double sqrt (double integer1){
	    double t;
	    double squareroot = integer1/2;
	    	
	    do{
	    		t = squareroot;
	    		squareroot = (t + (integer1/t))/2;
	    	}while ((t - squareroot) !=0);
	    
	    return squareroot;
	    }
//	 
	 public static String quadrDescriber (double a, double b, double c)
	 { 
		 String open = "";
		 String symmetry = "";
		 String vertex = "";
		 String yintercept = "";
		 String xintercept = "";
		 String heading ="Description of the graph of: ";
		 String equation = "y = " + a +" x^2 +" + b + "x + " + c  ;
		 
		 	if (a<0)
		 		open = "Opens: Down";
		 	else if (a>0)
		 		open = "Opens: Up";
		 	else if (a==0)
		 		open = "Linear"; 
		
		 double x = -b/(2*a);
		 symmetry = ("Axis of Symmetry: " + x);
		 
		 double y = a + b*Math.pow(x,2) + c;
		 vertex = "(" + x + ", " + y + ")";
		
		 if (discriminant(a,b,c)<0)
		 		xintercept = "none";
		 	
		 else {
			 double oneRoot = (-b + (sqrt(discriminant(a,b,c))))/(a*2.0);
			 double twoRoot = (-b - (sqrt(discriminant(a,b,c))))/(a*2.0);
		     
			 if (oneRoot==twoRoot) 
		    		xintercept =  ""+ twoRoot;
		    	
			 else	
		    		xintercept = "x-intercept(s): " + oneRoot + " " +twoRoot;
		 }
		 yintercept = "y-intercept: " + c;
		 String answer = heading + "\n"+ equation + "\n" + open + "/n" +  symmetry + vertex + xintercept + yintercept;
		 return answer; 
	 }

}
