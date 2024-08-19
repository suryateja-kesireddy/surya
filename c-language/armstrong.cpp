#include<stdio.h>
#include<math.h>
void main()
{
	int n,t,rem,arm=0;
	printf("entrer n value");
	scanf("%d",&n);
	t=n;
	while(n>0)
	{
		rem=n/10;
		arm=(rem*rem*rem)+arm;
		n=n%10;
	}
	if(t==arm)
	{
	printf("arm");
}
	else
	{
	
	printf("not");
}
   }
	
	

