import java.util.ArrayList;

import java.util.Scanner;

public class DataStructure1 {

	public static void main(String[] args) {
			int sum =0;
		 
		
		 Scanner loop = new Scanner(System.in);
		 
		 ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		 System.out.print("Please enter five numbers:");
		 		
		 		for(int i=0; i<5; i++)	{
		 			myNumbers.add(loop.nextInt());
		 		 	sum += myNumbers.get(i);
		 		 	 	 
		 		}
		 		System.out.println("Numbers you entered:"+ (myNumbers));
		 		System.out.println("Sum of numbers" + "  " + sum);
		 
		}

	


	}


