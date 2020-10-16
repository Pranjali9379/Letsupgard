package assignment3;
import java.util.Scanner;
public class odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  Scanner sc=new Scanner(System.in);
   int[] numbers=new int[5];
   
   numbers[0]=23;
   numbers[1]=42;
   numbers[2]=99;
   numbers[3]=44;
   numbers[4]=197;
   
   for(int i=0;i<5;i++)
   {
	   if(numbers[i]%2!=0)
	   {
		   System.out.println(numbers[i]);
	   }
   }
	}

}
