package com.arrays;

public class Example1
{
	/**
	 * Array is an drive data type used to store multiple values of similar or 
	 * homogeneous data value or elements.
	 * 
	 */

	public static void main(String[] args)
	{


		/**java program for print employee age 
		 * using java
		 */
		int employeeAges[] = {22,23,24,25,26};

		System.out.println("Elements count in an array: "+employeeAges.length);

		System.out.println("===================");


		//how to print the value of array
		/**
		 * Note: In java an array works based index concept, so array index starts from
		 *       zero(0) and ends with length-1 or size-1.
		 */

		for(int i = 0; i< employeeAges.length;i++)
		{
			System.out.println(employeeAges[i]);
			
		}
		
		System.out.println("==============");
		System.out.println(employeeAges[4]);
	}
		

}


