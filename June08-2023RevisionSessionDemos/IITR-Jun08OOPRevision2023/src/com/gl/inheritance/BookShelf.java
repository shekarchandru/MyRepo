package com.gl.inheritance;

public class BookShelf extends Furniture{

	int noOfShelves;
	
	public void acceptBookShelfDetails()
	{
		System.out.println("Enter Book Shelf Details");
		/*System.out.println("Enter the Length  ");
		length = scan1.nextInt();
		System.out.println("Enter the Width ");
		width = scan1.nextInt();
		System.out.println("Enter the Height");
		height = scan1.nextInt();*/
		super.acceptFurnitureDetails();
		System.out.println("Enter the No Of Shelves");
		noOfShelves = scan1.nextInt();
	}
	public void displayBookShelfDetails()
	{
		super.displayFurnitureDetails();
		System.out.println("The No Of Shelves is "+noOfShelves);
	}
	
}
