package Lab_12_11_2024;

public class PrimeChecker 
{
int number;

public PrimeChecker(int number) 
{
	super();
	this.number = number;
}
public boolean isPrime()
{
	if(number <=1)
	{
		return false;
	}
	
	for(int i=2; i<=Math.sqrt(number); i++)
	{
		if(number%i==0)
		{
			return false;
		}
	}
	return true;
}
public void printResult()
{
	System.out.println("Is "+number+" is prime number?");
	if(isPrime())
	{
		System.out.println("yes, is prime number");
	}else
	{
		System.out.println("no, it is not a prime number");
	}
}
}
