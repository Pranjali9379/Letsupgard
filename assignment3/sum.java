package assignment3;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  int[] number=new int[5];
  
  for(int i=0;i<5;i++)
  {
  System.out.println("Enter the number:");
  number[i]=sc.nextInt();
  }
  int sum=0;
  for(int i=0;i<5;i++)
  {
	  sum=sum+number[i];
  }
  System.out.println("Sum="+sum);
	}

}
