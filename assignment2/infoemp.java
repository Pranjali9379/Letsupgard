package assignment2;

import java.util.Scanner;

public class infoemp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name;
		int dob,mob,yob,age;
		float ms,as;
		System.out.println("Enter the name of person:");
		name=sc.nextLine();
		System.out.println("Enter the date of birth of person:");
		dob=sc.nextInt();
  	    System.out.println("Enter the month of birth of person:");
		mob=sc.nextInt();
		 System.out.println("Enter the year of birth of person:");
	    yob=sc.nextInt();
	    
	    System.out.println("Enter the monthly salary of person:");
	    ms=sc.nextFloat();
	    
	    
	    age=2020-yob;
	    as=ms*12;
	    
	    System.out.println("Name:"+name);
	    System.out.println("Age:"+age);
	    System.out.println("Annual salary:"+as);
	    
	    if(as>500000)
	    	System.out.println("20% tax amount has to pay");
	    else if(as>400000)
	    	System.out.println("15% tax amount has to pay");
	    else if(as>300000)
	    	System.out.println("10% tax amount has to pay");
	    else if(as>100000)
	    	System.out.println("5% tax amount has to pay");
	    else
	    	System.out.println("No tax amount to be paid");
	}

}
