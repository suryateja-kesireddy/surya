#include<stdio.h>
#include<math.h>
int main()
{
	int a,b,s;
	float r;
	printf("enter radius of a circle");
	scanf("%d",&a);
	printf("enter side of a square");
	scanf("%d",&b);
	r=3.14*a*a;
	s=b*b;
	printf("area of circle is%.2f\n",r);
	printf("area of square is %d\n",s);
	
}
