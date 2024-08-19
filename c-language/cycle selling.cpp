#include<stdio.h>
int main()
{
	int ic,rc,cc,ac,dp,tc;
	printf("The intial cost of the cycle");
	scanf("%d",&ic);
	printf("The cost of the  repairs");
	scanf("%d",&rc);
	printf("The cost of coloring");
	scanf("%d",&cc);
	printf("The cost of the new accessorices");
	scanf("%d",&ac);
	printf("The desired profit");
	scanf("%d",&dp);
	tc=ic+rc+cc+ac+dp;
	printf("cost price is%d\n",ic);
	printf("repair cost is%d\n",rc);
	printf("coloring cost is%d\n",cc);
	printf("accessaries cost is%d\n",ac);
	printf("desired profit is%d\n",dp);
	printf("selling price is%d\n",tc);
}
