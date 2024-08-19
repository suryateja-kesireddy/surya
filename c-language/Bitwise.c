#include<stdio.h>
int main()
{
int a,b;
printf("enter a value");
scanf("%d",&a);
printf("enter b value");
scanf("%d\n",&b);
printf("%d\n",a&b);
printf("%d\n",a|b);
printf("%d\n",a^b);
printf("%d\n",~a);
printf("%d\n",a<<1);
printf("%d\n",a>>1);
return 0;
}
