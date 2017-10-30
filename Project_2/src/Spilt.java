import java.util.Arrays;
/* Alex Zhou
 * 2nd period
 * October 29, 2017
 * StringSplit Assignment
 */
public class Spilt {
	public static void main(String[] args) {
		// Your task Part 0
		//String.split();
		//It's a method that acts on a string, <StringName>.split(<String sp>);
		//Where sp is the string where the string splits
		//And it returns an array
		// Example: "I like apples!".split(" "); 
//			it will split at spaces and return an array of ["I","like","apples!"]
		// Example 2: "I really like really red apples".split("really") 
//			it will split at the word "really" and return an array of ["I "," like "," red apples!"]
		//play around with String.split! 
		//What happens if you "I reallyreally likeapples".split("really") ?
		System.out.println(Arrays.toString("I like apples!".split(" ")));
		System.out.println(Arrays.toString("I really like really red apples".split("really")));
		System.out.println(Arrays.toString("I really like reallyreally red apples".split("really")));
		System.out.println(Arrays.toString("really like really red apples".split("really")));
		System.out.println(Arrays.toString("I really like really red apples,really".split("really")));
		
		System.out.println(splitBread("breadlettucetomatoeturkeybread"));
		/* Checks whether or not code can find items inside the sandwich while
		 * also ignoring items outside of the two breads.
		 */
		System.out.println(splitBread("breadcheeseeggbreadbacon"));
		/* Checks whether or not code can find that two breads besides one 
		 * another does not qualify as a sandwich.
		 */
		System.out.println(splitBread("breadbread"));
		/* Checks whether or not code can eliminate ingredients outside of 
		 * the sandwich.
		 */
		System.out.println(splitBread("cheesebreadeggbaconbreadtomatoe"));
	}
		//Your task Part 1:
		/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
		* use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
		* What if it's a fancy sandwich with multiple pieces of bread?
		*/
		public static String splitBread(String sandwich) {
			int first = sandwich.indexOf("bread");
			int second = sandwich.indexOf("bread" , first +4);
			if (second > 0){
			String realSandwich = sandwich.substring(first+5, second);
			if (realSandwich.length() > 1){
			String [] realSandwich1 = realSandwich.split(" ");
			String newSandwich1 = Arrays.toString(realSandwich1);
			sandwich = newSandwich1;
			}
			else if (realSandwich.length() < 1){
				sandwich = "It is not a sandwich!!!!";
			}
			}else{ 
				sandwich = "It is not a sandwich!!!!";
			}
			return sandwich;  
		}
		//Your task Part 2:
		/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
		* use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
		* Again, what if it's a fancy sandwich with multiple pieces of bread?
		*/
		
		public static String sandwichMaker (String sandwich){
			int first = sandwich.indexOf("bread");
			int second = sandwich.indexOf("bread" , first +5);
			if (second > 0){
			String realSandwich = sandwich.substring(first+6, second);
			if (realSandwich.length() > 1){
			String [] realSandwich1 = realSandwich.split(" ");
			String newSandwich1 = Arrays.toString(realSandwich1);
			sandwich = newSandwich1;
			}
			else if (realSandwich.length() < 1){
				sandwich = "It is not a sandwich!!!!";
			}
			}else{ 
				sandwich = "It is not a sandwich!!!!";
			}
			return sandwich;
		}

		//"bread"
		//"apples pineapples lettus tomato bacon mayo ham "
		//"apples pinapples bread lettus tomate bacon mayo ham bread cheese"
		
	}

