#include <stdio.h>
#include <math.h>

int main(int argc, char const *argv[])
{
	float x[10], y[10][10], sum, p, u, temp;
	int i, n, j, k=0, f, m;
	float fact(int);

	printf("\nhow many record you will be enter: ");
	scanf("%d",&n);
	for (int i = 0; i < n; ++i)
	{
		printf("\n\nenter the value of x %d : ", i);
		scanf("%f", &x[i]);
		printf("\n\nenter the value of f(x %d) : ", i);
		scanf("%f", &y[k][i]);
	}

	printf("\n\nEnter X for finding f(x) : ");
	scanf("%f", &p);
	for ( i = 1; i < n; i++)
	{
		for ( j = 0; j < n; j++)
		{
			y[i][j] = y[i-1][j+1] - y[i-1][j];
		}
	}

	printf("\n________________________________________________\n");
	printf("\n  x(i)\t y1(i)\t   y2(i)   y3(i)   y4(i)\n");
	printf("\n________________________________________________\n");

	for (int i = 0; i < n; i++)
	{
		printf("\n %.3f ", x[i]);
		for (int j = 0; j < n-1; j++)
		{
			printf("    ");
			printf(" %.3f ", y[j][i]);
		}
		printf(" \n");
	}
	i=0;





	do
	{
		if(x[i] < p && p < x[i+1])
			k = 1;
		else
			i++;	
	} while (k != 1);
	f= i;
	u = (p-x[f])/(x[f+1]-x[f]);
	printf("\n\n u = %.3f ",u );
	n = n-i+1;
	sum = 0;
	for (int i = 0; i < n-1; i++)
	{
		temp=1;
		for (int j = 0; j < i; j++)
		{
			temp = temp * (u - j);
		}
		m = fact(i);
		sum = sum + temp*(y[i][f]/m);
	}
	printf("\n\n f(%.2f) = %f ", p, sum);




	return 0;
}

float fact(int a) {
	float fac = 1;
		if(a == 0) 
				return 1;
		else 
			fac = a * fact(a-1);
	return fac;
}