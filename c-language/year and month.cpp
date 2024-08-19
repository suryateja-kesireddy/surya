#include<stdio.h>
#include<math.h>
int main()
{
	int n,y,m,w,d;
	printf("enter number of days");
	scanf("%d",&n);
	y=n/365;
	printf("%dyear\n",y);
	y=n%365;
	m=y/30;
	printf("%dmonth\n",m);
	w=y/7;
	printf("%dweeks\n",w);
	d=m%7;
	printf("%ddays",d);
}
