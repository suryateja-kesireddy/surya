package Lab_7_10_2024;

public class Employee_toString 
{
	String firstName;
	String lastName;
	int employeeId;
	double salary;
	int noOfProjects;
	
		public void setEmployeeData(String firstName,String lastName, int employeeId,double salary,int noOfProjects)
		{
			this.firstName=firstName;
			this.lastName=lastName;
			this.employeeId=employeeId;
			this.salary=salary;
			this.noOfProjects=noOfProjects;
		}
		
	@Override
		public String toString() {
			return "Employee_toString [firstName=" + firstName + ", lastName=" + lastName + ", employeeId=" + employeeId
					+ ", salary=" + salary + ", noOfProjects=" + noOfProjects + "]";
		}

	public void calculateSalary()
	{
		if(this.noOfProjects>=5 && this.noOfProjects<=10)
		{
			this.salary=salary+5000;
		}
		else if(this.noOfProjects>=10 && this.noOfProjects<=20)
		{
			this.salary=salary+10000;
	}else if(this.noOfProjects>=20 && this.noOfProjects<=30)
	{
		this.salary=salary+15000;
}

}
}

