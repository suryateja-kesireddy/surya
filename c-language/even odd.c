#include<stdio.h>
int main()
{
	int n;
	printf("enter n value");
	scanf("%d",&n);
	n=n%2;
	if(n==0||n!=0)
	switch(n)
	{
		case 0: printf("even");break;
		default :printf("odd");
	}
}
