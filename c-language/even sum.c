#include<stdio.h>
int main()
{
	int n,i ,s=0;
	printf("enter a number");
	scanf("%d",&n);
	for(i=0;i<=n*2;i++)
	{
		if(i%2==0) 
		 printf("%4d\n",i,s=s+i); 	

	}
	printf("The sum even numbers is:%d",s);
}
