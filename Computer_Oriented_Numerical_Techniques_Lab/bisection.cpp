//Program to find the real root of a non-linear equation using Bisection Method
// You must change f(x) as per the need
#include <stdio.h>
#include <math.h>

#define epsilon 0.001 // Margin of error
#define maxiteration 20 // define the maximun number of iterations

double f(double);

int main() {
	double l,u,m; // lowerbound -l , uppercound -u and mid point -m
	int iteration=0;
	printf("\n\tEnter the lower and upper bound values?\n");	
	scanf("%lf %lf",&l,&u);
	//check if the bounds specified by you,contains the root. lf not then exit.
	if(fabs(f(l)) <= epsilon) {
		printf("\n\tThe Root is at the lower limit specified by You, that is %.2f\n",l);
	}
	if(fabs(f(u)) <= epsilon) {
		printf("\n\tThe Root is at the upper limit specified by You, that is %.2f\n",u);
	}
	//check if the bounds specified by you, contains the root, if not exit.
	if(f(l)*f(u) > 0 ){
		printf("\n\tThe Root MAY NOT be in the lower bounds %.2f (function values = %.2f) \n\t and upper bounds %.2f (function values = %.2f)\n",l,f(l),u,f(u));

	}
	//bisect the internal and check if this isd the root, if yes then output the values, repeat it for only a number of fixed iterations 
	m = (l + u)/2.0;
	while((fabs(f(m)) > epsilon) && (iteration < maxiteration))
	{
		if(f(l)*f(m) < 0)
			u = m;
		else 
			l = m;
		printf("\n\t Values at iteration %d are:l = %.2f(%.2f), and u = %.2f(%.2f)", iteration + 1, l, f(l),u,f(u));
		iteration++;
		m = (l + u)/2.0;

	}
	if(fabs(f(m)) < epsilon)
		printf("\n\tThe Root of the Equation is %.2f\n",m );
	else 
		printf("\n\tThe Root could not be reached after %d iterations\n", maxiteration);

	return 0;

}

double f(double x){
	return x*x-4*x;
}