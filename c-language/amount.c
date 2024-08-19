#include<stdio.h>
int main()
{
	int n,f,h,fi,t,fic,tc,oc,te;
	printf("enter n value");
	scanf("%d",&n);
	f=n/500;
	printf("500 notes:%d\n",f);
	n=n%500;
	h=n/100;
	printf("100 notes:%d\n",h);
	n=n%100;
	fi=n/50;
	printf("50 notes:%d\n",fi);
	n=n%50;
	t=n/20;
	printf("20 notes:%d\n",t);
	n=n%20;
	te=n/10;
	printf("10 coins :%d\n",te);
	n=n%10;
	fic=n/5;
	printf("5 coins :%d\n",fic);
	n=n%5;
	tc=n/2;
	printf("2 coins:%d\n",tc);
	n=n%2;
	oc=n/1;
	printf("1 coins:%d\n",oc);
	
}
