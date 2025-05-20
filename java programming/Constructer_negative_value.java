package Lab_09_10_24;

public class Constructer_negative_value 
{
 String name;
 int runs;
 int matches;
float batting_Avg;

public Constructer_negative_value() 
{
	
}
public Constructer_negative_value(String name, int runs, int matches) {
	super();
	this.name = name;
	this.runs = runs;
	this.matches = matches;
	
	
}
@Override
public String toString() {
	return "Constructer_negative_value [name=" + name + ", runs=" + runs + ", matches=" + matches + ", batting_Avg="
			+ (float)batting_Avg + "]";
}
public void Batting_avg()
{ 
if(this.matches!=0)
{
	if(this.runs>0&this.matches>0)
	{ 
		
		this.batting_Avg=(float)this.runs/this.matches;
	}else if((this.runs/this.matches)<0)
	{
		System.out.println("error");
	}

}
	}	
public void getStatistics()
{
	if(this.matches>0&this.runs>0)
	{ 
		if(this.name!="")
		{
		System.out.println(this.name);
		System.out.println(this.matches);
		System.out.println(this.runs);
		System.out.println("average is="+(float)this.runs/this.matches); 
		}else 
		{
			System.out.println("error");
		}
	}else  
	{
		System.out.println("error");
	}

}
}

