package assignment3;
import java.util.Scanner;
public class avg {

	        Scanner sc=new Scanner(System.in);
		    public String name,planet;
		    public int age,weapon;
            public float power;
		        public void getDetails(){

		            System.out.println("Enter the name");
		            name=sc.nextLine();
		            System.out.println("Enter the age");
		            age=sc.nextInt();
		            System.out.println("Enter the power");
		            power=sc.nextFloat();
		            System.out.println("Enter the weapon");
		            weapon=sc.nextInt();
		            System.out.println("Enter the planet");
		            planet=sc.next();


		        }
		         public void displayDetails(){

		             System.out.println("the name is "+name+" and the age is "+age+" and the power is "+power+" and the weapon is "+weapon+" and the planet is "+planet);

		         }

	}


