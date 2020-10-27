package day2;
public class Employee {
	
	static int counter=1;
	static {
		counter=1;
	}
	
	public int empid;
	public String ename;
	public double BASIC_SALARY;
	public double HRA;
	public double medical;
	public double pf;
	public double pt;
	public double NET_SALARY;
	public double GROSS_SALARY;
	
	public Employee()
	{
		System.out.println("Default Constr");
	}

	
	public Employee( String ename, double bASIC_SALARY, double medical) {
		super();
		this.empid = counter++;
		this.ename = ename;
		BASIC_SALARY = bASIC_SALARY;
		this.medical = medical;
		HRA=.5*BASIC_SALARY ;
		pf=.12*BASIC_SALARY;
		pt=200;
		GROSS_SALARY=BASIC_SALARY+HRA+medical;
		NET_SALARY=GROSS_SALARY-(pt+pf);
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", BASIC_SALARY=" + BASIC_SALARY + ", HRA=" + HRA
				+ ", medical=" + medical + ", pf=" + pf + ", pt=" + pt + ", NET_SALARY=" + NET_SALARY
				+ ", GROSS_SALARY=" + GROSS_SALARY + "]";
	}
	
	public void printEmpDetails()
	{
		System.out.println(this.toString());
	}
}
