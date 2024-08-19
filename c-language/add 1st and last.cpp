#include<stdio.h>
int main()
{
	int a,b,c,d;
	printf("enter a value");
	scanf("%d",&a);
	b=a%10;
	a=(a/100)+b;
	printf("%d",a);
}
