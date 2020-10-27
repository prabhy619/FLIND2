package day2.FLIND2;
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

	
	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public double getBASIC_SALARY() {
		return BASIC_SALARY;
	}


	public void setBASIC_SALARY(double bASIC_SALARY) {
		BASIC_SALARY = bASIC_SALARY;
	}

	public double getNetSalary()
	{
		return BASIC_SALARY+HRA+medical;
	}

	public double getGrossSalary()
	{
		return BASIC_SALARY-pt -pf;
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

	
	public void printEmpDetails()
	{
		System.out.println("EMP ID "+ getEmpid());
		System.out.println("EMP NAME "+ getEname());
		System.out.println("EMP NET_SALARY"+ NET_SALARY);
	}	
	
}
