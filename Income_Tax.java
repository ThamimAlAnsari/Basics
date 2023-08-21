package project;

public class Income_Tax {

	public static void main(String[] args) {
		double amount=700000.0;
		Income_Tax it=new Income_Tax();
		double t1=it.revisedTax(amount);
		System.out.println("The tax to be payed: "+t1);
		double t2=it.oldTax(amount);
		System.out.println("The tax to be payed: "+t2);
		double t3=it.previousTax(amount);
		System.out.println("The tax to be payed: "+t3);
		double better=(t1<t2?t1:t2<t3?t2:t3);
		System.out.println("The preferred tax to be payed: "+better);
	}

	private double revisedTax(double amount) {
		// TODO Auto-generated method stub
		double tax=0.0;
		if(amount>0.0 && amount<=300000.0)
			tax=0.0;
		else if(amount>300000.0 && amount<=600000.0)
			tax=0.05*(amount-300000.0);
		else if(amount>600000.0 && amount<=900000.0)
			tax=(0.05*300000.0)+(0.1*(amount-600000.0));
		else if(amount>900000.0 && amount<=1200000.0)
			tax=(0.05*300000.0)+(0.1*600000.0)+(0.15*(amount-900000.0));
		else if(amount>1200000.0 && amount<=1500000.0)
			tax=(0.05*300000.0)+(0.1*600000.0)+(0.15*900000.0)+(0.2*(amount-1200000.0));
		else
			tax=(0.05*300000.0)+(0.1*600000.0)+(0.15*900000.0)+(0.2*1200000.0)+(0.3*(amount-1500000));
		return tax;
	}

	private double oldTax(double amount) {
		// TODO Auto-generated method stub
		double tax=0.0;
		if(amount>0.0 && amount<=250000.0)
			tax=0.0;
		else if(amount>250000.0 && amount<=500000.0)
			tax=0.05*(amount-250000.0);
		else if(amount>500000.0 && amount<=1000000.0)
			tax=(0.05*250000.0)+(0.2*(amount-500000.0));
		else
			tax=(0.05*250000.0)+(0.2*500000.0)+(0.3*(amount-1000000.0));
		return tax;
	}

	private double previousTax(double amount) {
		// TODO Auto-generated method stub
		double tax=0.0;
		if(amount>0.0 && amount<=250000.0)
			tax=0.0;
		else if(amount>250000.0 && amount<=500000.0)
			tax=0.05*(amount-250000.0);
		else if(amount>500000.0 && amount<=750000.0)
			tax=(0.05*250000.0)+(0.1*(amount-500000.0));
		else if(amount>750000.0 && amount<=1000000.0)
			tax=(0.05*250000.0)+(0.1*500000.0)+(0.15*(amount-750000.0));
		else if(amount>1000000.0 && amount<=1250000.0)
			tax=(0.05*250000.0)+(0.1*500000.0)+(0.15*750000.0)+(0.2*(amount-1000000.0));
		else if(amount>1250000.0 && amount<=1500000.0)
			tax=(0.05*250000.0)+(0.1*500000.0)+(0.15*750000.0)+(0.2*1000000.0)+(0.25*(amount-1250000.0));
		else
			tax=(0.05*250000.0)+(0.1*500000.0)+(0.15*750000.0)+(0.2*1000000.0)+(0.25*1250000.0)+(0.3*(amount-1500000));
		return tax;
	}

}
