package com.arrayTypes;


/**
 * Multidimensional array.
 * 
 *
 */
public class Example3
{

	// multidimensional array in one line

	public static void main(String[] args)
	{

		// declaration , instantiation and initialization of array in one line

		int customerIds[][] = {{2020, 2021} ,{2022, 2023}}; //2*2=4

		for(int i = 0; i < customerIds.length; i++)
		{

			for(int j = 0; j < customerIds.length; j++)

			{

				System.out.println(customerIds[i][j]);


			}

		}

		System.out.println("===========");

		for(int i = 0; i < customerIds.length; i++)
		
		{


			for(int j = 0; j < customerIds.length; j++)

			{
				System.out.print(customerIds[i][j]+"\t");
				
				
			}
			
			System.out.println("\n\n\n\n");




			}
		}

	}
