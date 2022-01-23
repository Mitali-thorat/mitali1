package com.arrayGeneralPrograms;

public class Example1 {

	public static void main(String[] args)
	{
		int[] myArray = { 6 , 42, 3 , 7 };
		
		int sum=0;
		for(int x=0; x<myArray.length; x++) {
			sum = sum+ myArray[x];
		}
		System.out.println(sum);

	}

}
