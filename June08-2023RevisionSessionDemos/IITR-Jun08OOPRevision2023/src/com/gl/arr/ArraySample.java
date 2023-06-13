package com.gl.arr;

import java.util.Scanner;

public class ArraySample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan1 = new Scanner(System.in);
		int size ;
		System.out.println("Enter the Size of the Array");
		size  = scan1.nextInt();
		int array1[] = new int[size];
		int sum = 0;
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the "+(i+1)+" Element ");
			array1[i] = scan1.nextInt();
			sum = sum + array1[i];
		}
		for(int x:array1) // For Each loop
		{
			System.out.println("The Element is "+x);
		}
		System.out.println("The Sum of the Array Elements is "+sum);
		

	}

}
