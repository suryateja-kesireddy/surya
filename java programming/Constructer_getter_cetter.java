package Lab_09_10_24;

public class Constructer_getter_cetter
{
	private String firstName;
	private String lastName;
	private int employeeId;
	private double salary;
	private int NoOfProjects;
	
	public Constructer_getter_cetter(String firstName, String lastName, int employeeId,double salary, int noOfProjects) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.salary=salary;
		NoOfProjects = noOfProjects;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getNoOfProjects() {
		return NoOfProjects;
	}

	public void setNoOfProjects(int noOfProjects) {
		NoOfProjects = noOfProjects;
	}

	@Override
	public String toString() {
		return "Constructer_getter_cetter [firstName=" + firstName + ", lastName=" + lastName + ", employeeId="
				+ employeeId + ", salary=" + salary + ", NoOfProjects=" + NoOfProjects + "]";
	}
	public void calculateSalary()
	{
		if(this.NoOfProjects>0)
		{
		if(this.NoOfProjects>=5&&this.NoOfProjects<=10)
		{
		 this.salary=salary+5000;
		}
		else if(this.NoOfProjects>10&&this.NoOfProjects<=20)
		{
			this.salary=salary+10000;
		}
		else if(this.NoOfProjects>20)
		{
			this.salary=salary+15000;
		}else if(this.NoOfProjects>=0&&this.NoOfProjects<5)
		{
			System.out.println("no increment salary is same need to improve more="+this.salary);
		}
		}
		else {
			System.out.println("Number of projects cannot be negative"+this.salary);
		}
	}
}
