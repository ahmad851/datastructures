/**********************************************************
 * EECS2011: Fundamentals of Data Structures,  Winter 2019
 * Assignment 2
 * Section:  M  
 * Student Name:Ahmad Baig  
 * Student eecs account: ahmad85
 * Student ID number: 215180870
 **********************************************************/
package assignment2;

import java.util.Arrays;

public class Lights {

	
	
	public static int[] arr = new int[] {1,1,1,1};
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		System.out.println(Arrays.toString(arr));
		turnOff(4);
		
	}

	
	
	/////turn off//////////////
	
	public static void turnOff(int n) {
	
		if(n==1) {
			arr[0]=0;
			System.out.println(Arrays.toString(arr));

		}
		if(n==2) {
			arr[1]=0;
			System.out.println(Arrays.toString(arr));
			turnOff(n-1);
			
		}else {
			if(n>2) {
				turnOff(n-2);
				arr[n-1]=0;
				System.out.println(Arrays.toString(arr));

			}
			
			if(n>2) {
				turnOn(n-2);
				turnOff(n-1);
				System.out.println(Arrays.toString(arr));

			}	
		}
	}
	
	
	
	///////////turn on/////////////////////
	
	public static void turnOn(int n) {
		
		if(n==1) {
			arr[0]=1;
			System.out.println(Arrays.toString(arr));

		}
		if(n==2) {
			arr[0]=1;
			System.out.println(Arrays.toString(arr));
			arr[1]=1;
			System.out.println(Arrays.toString(arr));
		}else {
			if(n>2) {
				turnOn(n-2);
				arr[n-2]=1;
				System.out.println(Arrays.toString(arr));

			}
			
			if(n>2) {
				turnOff(n-2);
				arr[n-1]=1;
				System.out.println(Arrays.toString(arr));
				turnOn(n-2);
			}
			
		}
		
	}
				
			 
	
}
