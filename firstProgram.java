/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

class Codechef
{
    public static int purchase(int qty)
    {
        int cost = 100*qty;
    
        if(cost>1000)
            cost=(90*cost)/100;
    
        return cost;
    }
    
    public static void quadratic(double a, double b, double c)
    {
        double d, x1, x2;
        
        d = Math.sqrt(Math.pow(b,2) - 4*a*c);
        
        if(d == 0)
            System.out.println("The roots are Real and Equal.");
        else if(d > 0)
            System.out.println("The roots are Real and Un-Equal");
        else
            System.out.println("The Roots are Imaginary");
        
        x1 = (-b+d)/(2*a);  x2 = (-b-d)/(2*a);
        
        System.out.println("The Roots are "+x1+" and "+x2);
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int choice; 
		char x;
		Scanner sc = new Scanner(System.in);
		
		do{
		    System.out.println("Press 1: To get the cost to be paid by Consumer");
		    System.out.println("Press 2: To Find the maximum value out of Two Number-->");
		    System.out.println("Press 3: To solve a quadratic equation and find its root -->");
		
		    System.out.println("Enter Your choice -->");
		
		    choice = sc.nextInt(); System.out.println(choice);
		    switch(choice)
		    {
		        case 1:
		            System.out.println("Enter the quantity");
		            int qty = sc.nextInt();
		            System.out.println("The Cost of purchase is "+purchase(qty));
		            break;
		            
		        case 2:
		            System.out.println("Enter two Numbers");
		            int m,n;
		            m = sc.nextInt();
		            n = sc.nextInt();
		            if(m!=n)
		            System.out.println( "The Largest Number is "+Math.max( m ,n ) );
		            else 
		            System.out.println("Both Numbers are equal");
		            break;
		            
		        case 3:
		            System.out.println("Enter the values of a, b, c");
		            double a,b,c;
		            a = sc.nextDouble();
		            b = sc.nextDouble();
		            c = sc.nextDouble();
		            quadratic(a,b,c);
		            break;
		            
		         default:
		            System.out.println("Wrong Choice. Choose Correctly if you want to Continue");
		    }
		    System.out.println("Do You want to Continue ??");
		    System.out.println("Press any key to Continue and n to exit");
		    x = sc.next().charAt(0);  System.out.println(x);
		}while(x!='n' || x!='N');

	}
}
