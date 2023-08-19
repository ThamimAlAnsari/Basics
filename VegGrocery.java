package project;

import java.util.Scanner;

public class VegGrocery {
	public static void main(String[] args) {
		// Grocery list for customers 
		    System.out.println("*****************Welcome to Veg Groceries*****************");
		    System.out.println("----------------------------------------------------------");
		    System.out.println("  CODE                  PRODUCT                   AMOUNT  ");
		    System.out.println("----------------------------------------------------------");
		    System.out.println("    1                   TOMATO                      20    ");
		    System.out.println("    2                   ONION                       25    ");
		    System.out.println("    3                   BEANS                       45    ");
		    System.out.println("    4                   CARROT                      40    ");
		    System.out.println("    5                   CUCUMBER                    15    ");
		    System.out.println("----------------------------------------------------------");
		    System.out.println();
		    VegGrocery vg=new VegGrocery();
		        double pay=vg.calcBill();
		    System.out.println("Your bill to pay: "+pay);
		    System.out.println("----------------------------------------------------------");
		    System.out.println();
		    System.out.println("*****************Thank you for shopping*******************");

	}

	private double calcBill() {
		// TODO Auto-generated method stub
		double t_Price=20.0,o_Price=25.0,b_Price=45.0,c_Price=40.0,cu_Price=15.0;
		double tot_Amount=0;
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter your product code: ");
			        int code=sc.nextInt();
			     if(code==6) {
			    	 sc.close();
			    	 return tot_Amount;}
			       
			System.out.print("Enter the quantity: ");
			        double qty=sc.nextDouble();
			switch(code)
			{
			case 1: 
				tot_Amount=tot_Amount+(t_Price*qty);
			    break;
			case 2: 
				tot_Amount=tot_Amount+(o_Price*qty);
			    break;
			case 3: 
				tot_Amount=tot_Amount+(b_Price*qty);
			    break;
			case 4: 
				tot_Amount=tot_Amount+(c_Price*qty);
			    break;
			case 5: 
				tot_Amount=tot_Amount+(cu_Price*qty);
			    break;
			default: 
				System.out.println("Enter a valid choice!");
			}
		}
		
	}

}
