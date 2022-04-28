#include<stdio.h>
main()
{
	int n,i,a=1,b=0,x,y,d,m;
	printf("enter last N:");
	scanf("%d",&n);

	for(i=1;i<=n;i++)
	  { 
		d=a+b;
		if(d<=n)
       {
		 a=b;
        b=d;	
       printf("%d\t",d);
}
}
}