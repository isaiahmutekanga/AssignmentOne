//Assignment one
//Author: Isaiah Mutekanga
//This program displays a Fibonacci sequence
import java.util.*;
import java.time.*;
public class AssignmentOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner for reading user input
		Scanner reader = new Scanner(System.in);
		//Initializing number
		int number = 0;
		
		//Asking the user which number in sequence.
		System.out.println("Which number?");
		number = reader.nextInt();
		
		//Start time for Recursive function
		long startTime=  System.nanoTime();

		//For loop to output fibonacci series
		System.out.println("\nFibonacci series(Recursive) in Java of number "+number); 
		for (int i = 1; i <= number; i++) {
			System.out.printf("%s ", fiboSeriesRec(i));
			}
		
		long endTime = System.nanoTime();
		//Time Elapsed
		long timeElapsed= endTime-startTime;
		
		System.out.println("\nElapsed time in milliseonds is: " + timeElapsed/1000000);
		
		//Start time for iterative function
		long startTime1=  System.nanoTime();
		
		//For loop to output fibonacci series
		System.out.println("\nFibonacci series(Iterative) in Java of number "+number); 
		for (int i = 1; i <= number; i++) {
			System.out.printf("%s ", fiboSeriesIte(i));
			
			}
	    //End time
		long endTime1 = System.nanoTime();
		//Time Elapsed
		long timeElapsed1= endTime1-startTime1;
		
		System.out.println("\nElapsed time in milliseconds  is: " + timeElapsed1/1000000);


		

	}
	//Recursive function
	public static int fiboSeriesRec(int n){
		 if(n == 0)
		        return 0;
		    else if(n == 1)
		      return 1;
		   else
		      return fiboSeriesRec(n - 1) + fiboSeriesRec(n - 2);
		
		
	}
	//Iterative Function
	public static int fiboSeriesIte(int n){
		
			 if(n <= 1){
			  return n;
			 }
			 int num = 1;
			 int num2 = 1;
			 
			 //for loop
			 for(int i = 2; i < n; ++i){
			  int iterate = num;
			   num += num2;
			  num2 = iterate;
			 }
			 return num;
			
			 
			  
	}

}
