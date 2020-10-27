package day2;
public class Employee {
	public int empid;
	public String ename;
	public double BASIC_SALARY;
	public double HRA;
	public double medical;
	public double pf;
	public double pt;
	public double NET_SALARY;
	public double GROSS_SALARY;
	
	//public static String company="HSBC";

	/*
	 * public Employee(int empid, String ename, int salary) { this();
	 * System.out.println("PARAMETERIZED CONSTR"); this.empid = empid; this.ename =
	 * ename; this.salary = salary; }
	 */
	public Employee()
	{
		System.out.println("Default Constr");
	}

	public Employee(int empid, String ename, double bASIC_SALARY, double medical) {
		super();
		this.empid = empid;
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
	
	public void displayEmpDetails()
	{
		System.out.println(this.toString());
	}

	/*
	 * public void printEmp() { System.out.println("ID "+ empid);
	 * System.out.println("name "+ ename); System.out.println("salary "+ salary); }
	 */	
}
