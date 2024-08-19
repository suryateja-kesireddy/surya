#include<stdio.h>
int main()
{
	int age,price,bill;
	float height,dis;
	char y,n;
	start:
	printf("enter your age:");
	scanf("%d",&age);
	printf("enter your height:");
	scanf("%f",&height);
	printf("you are having vip pass:");
	scanf("%c%c",&y,&n);
	if(age<=0)printf("enter a vaild age\n");
   else	if(age<=3) price=0;
    else if(age<=12) price=20;
	else if(age<=64) price=100;
	else price=50;
	if(height<=120)
	{
		bill=price*0.50;
	}
	else if(height<=180)
	{
		bill=price;
	}
	else
	{
		bill=price+50;
	}
	if(y=='y')
	{
		dis=bill*0.10;
		bill=bill-dis;
	}
	printf("The calculated base ticket price before any discounts or additional charges:%d\n",price);
	printf("Any discounts or additional charges applied based on height:%d\n",dis);
	printf("The final ticket price after applying all discounts and charges:%d\n",bill);
	

}
