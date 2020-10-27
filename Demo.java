package day2.FLIND2;

import day2.Calculator;



public class Demo {
	
	public static void getDetails(Object a)
	{
		if(a.getClass().equals(Manager.class))
		{
			Manager tmp=(Manager)a;
			tmp.printEmpDetails();
			return;
		}
		else if(a.getClass().equals(Marketingexecutive.class))
		{
			Marketingexecutive tmp=(Marketingexecutive)a;
			tmp.printEmpDetails();
			return;
		}

		Employee tmp=(Employee)a;
		tmp.printEmpDetails();
	
	}
	
	public static void main(String[] args) {
		Manager m=new Manager("abcde",10000,1500);
		System.out.println(m.getGrossSalary());
		
		getDetails(m);yu
	}
}
