package com.gl.sample;

import java.util.Scanner;

public class ArraySample {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int size;
		System.out.println("Enter the size of the Array");
		size = scan.nextInt();
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the Array Element "+(i+1));
			arr[i] = scan.nextInt();
			sum = sum+arr[i];
		}
		System.out.println("The Sum of the Integer Array elements is  "+sum);
		System.out.println("The elements are ");
		for(int i:arr)
		{
			System.out.println("Element is "+i);
		}

	}

}
