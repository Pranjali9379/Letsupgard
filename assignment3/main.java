package assignment3;
import java.util.Scanner;
public class main {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

		 avg[] employees=new avg[5];
		 
		 
		 for(int i=0;i<5;i++)
	        {
	            employees[i]=new avg();
	            employees[i].getDetails();
	        }


	        //        print details
	        for(int i=0;i<5;i++)
	        {
	            employees[i].displayDetails();
	        }
	}

}
