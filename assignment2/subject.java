package assignment2;

import java.util.Scanner;

public class subject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
        float m,s,e,c,p,total,percentage;
        
    System.out.println("Enter maths marks:");
    m=sc.nextFloat();
    System.out.println("Enter social marks:");
    s=sc.nextFloat();
    System.out.println("Enter english marks:");
    e=sc.nextFloat();
    System.out.println("Enter computer marks:");
    c=sc.nextFloat();
    System.out.println("Enter science marks:");
    p=sc.nextFloat();
    
    total=m+s+e+c+p;
    percentage=(total*100)/500;
    System.out.println("total:"+total);
    System.out.println("percentage-"+percentage);
    
    if(percentage>=75 && percentage<100)
    {
    	System.out.println("Got A grade");
    	}
    else if(percentage>=50 && percentage<75)
    {
    	System.out.println("Got B grade");
    }
    else if(percentage>=35 && percentage<50)
    {
    	System.out.println("Got C grade");
    }
    else
    {
    	System.out.println("Fail");
    }

}
}
