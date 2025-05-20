package Lab_12_11_2024;

public class New_Sport
{
	

	public class Sports 
	{
	private String sportname;
	private int teamsize;
	private String sporttype;

	public Sports(String sportname, int teamsize) {
		super();
		if(teamsize<=0)
		{
			System.out.println("Error");
		}
		this.sportname = sportname;
		this.teamsize = teamsize;
	}

	public Sports(String sportname, int teamsize, String sporttype) {
		super();
		this.sportname = sportname;
		this.teamsize = teamsize;
		if(teamsize<=0)
		{
			System.out.println("Error:Team size less than 0 is not possible");
		}
		this.sporttype = sporttype;
	}
	public void displayInfo()
	{
		System.out.println("Sports name:"+sportname);
		System.out.println("Team size:"+teamsize);
		System.out.println("sport Type:"+sporttype);
	}
	}
}
