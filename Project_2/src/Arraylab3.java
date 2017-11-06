/*Alex Zhou
 *11-1-17
 *2nd period
 *A class called ArrayLab3 that contains 6 static methods(main plus 5 methods)
 */
import java.util.Arrays;
public class Arraylab3 {
	//Method that accepts two arrays of integers aa1 and arr2 and returns an array of integers
	//in which every element is the sum of the elements at that indexfor the arrays arr1 and arr2
	public static int[] sum(int[] arr1, int[] arr2) {
		int [] returnArray = new int[arr1.length];
		for(int i = 0; i< arr1.length; i++){
			returnArray[i]= arr1[i]+arr2[i];
		}
		return returnArray;
	}
	//Method that accepts an array of integers arr of length n and an integer num, 
	//and returns an array of integers of length n+1 that consists of the elements of arr
	//with num appended to the end
	public static int[] append(int[] arr, int num) {
		int [] returnArray = new int[arr.length+1];
		for(int i = 0; i<arr.length; i++) {
			returnArray[i]+= arr[i];
		}
		returnArray[returnArray.length-1]= num;
		return returnArray;
	}
	//Method that accepts an array of integers arr and an integer idx and returns 
	//an array of integers consisting of all of the elements of arr expect for the element at index idx.
	public static int[] remove(int[] arr, int idx) {
		int[] returnArray = new int[arr.length-1];
		for(int i = idx-1; i<arr.length-1;i++) {
			arr[i]= arr[i+1];
		}
		for(int i = 0; i< returnArray.length; i++){
			returnArray[i]= arr[i];
		}
		return returnArray;
	}
	//Method that accepts an array of integers arr and returns an integer containing the sum of the 
	//elements at the even indices of arr
	public static int sumEven(int[] arr) { 
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]%2==0)
				sum += arr[i];
			i++;
		}
		return sum;
	}
	//Method that accepts an array of integers arr and does not return a value. 
	//The method moves each element of arr one index to the right
	//(element 0 goes to element 1, element 1 goes to element 2, ..., element n-1 goes to element 0)
	public static void rotateRight(int[] arr) {
	int last = arr[arr.length-1];
	for(int i = arr.length-1; i>= 1; i--) {
		arr[i] = arr[i-1];
	}
	arr[0]=last;
	}
	
	public static void main(String[] args) {
		//part B
		int[] a1 = {5,10,15,20,25,30,35,40}; //1
		int[] a2= {7,14,21,28,35,42,49,56}; 
		int[] sumArr = sum(a1,a2); //2
		int appendNum = 200; //3
		int[] appendArr =append	(a1, appendNum); //4
		int removeldx = 5; //5
		int[]	removeArr=	remove(a2,removeldx); //6
		int	SumOfEvens = sumEven(appendArr); //7
		rotateRight(a1); //8
		//part C
		System.out.println("sumArr: " + Arrays.toString(sumArr)); //1
		System.out.println("appendArr: " + Arrays.toString(appendArr)); //2
		System.out.println("removArr: " + Arrays.toString(removeArr));	 //3
		System.out.println("sumOfEvens: " + SumOfEvens); //4
		System.out.println("a1: " + Arrays.toString(a1));
	}
	}




