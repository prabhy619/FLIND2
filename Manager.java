package day2.FLIND2;

public class Manager extends Employee {
	
	Manager(String ename, double bASIC_SALARY, double medical)
	{
		super(ename, bASIC_SALARY, medical);
	}
	
	static double petrolA=0.08;
	static  double otherlA=0.03;
	static double foodA=0.13;
	
	public double getGrossSalary()
	{
		//System.out.print("here");
		return super.getGrossSalary()+ (petrolA+otherlA+foodA)*super.getBASIC_SALARY();
	}

	public void printEmpDetails()
	{
		System.out.println("EMP ID "+ getEmpid());
		System.out.println("EMP NAME "+ getEname());
		System.out.println("EMP GROSS_SALARY"+ this.GROSS_SALARY);
	}
	
}
