package day2.FLIND2;

public class Marketingexecutive extends Employee{
	Double distance=0.0;
	static double telephoneAllowance=1500;
	static double tourAllowanceRate=5;
	public Marketingexecutive() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Marketingexecutive(String ename, double bASIC_SALARY, double medical,double distance) {
		super(ename, bASIC_SALARY, medical);
		this.distance=distance;
		// TODO Auto-generated constructor stub
	}
	public double getGrossSalary()
	{
		return super.getGrossSalary()+telephoneAllowance+tourAllowanceRate*distance;
	}
	
	public void printEmpDetails()
	{
		System.out.println("EMP ID "+ getEmpid());
		System.out.println("EMP NAME "+ getEname());
		System.out.println("EMP GROSS_SALARY"+ this.GROSS_SALARY);
	}
	
}
