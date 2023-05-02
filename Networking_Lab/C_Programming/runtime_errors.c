/* Program to divide a sum of two numbers by their difference*/
#include <stdio.h>
	int main( )
{
	int a, b;
	float c;
	a=10;
	b=10;
	c = (a+b)/(a-b);
	printf("The value of the result is %f\n",c);
	return 0;
}

/* 
 * 
The above program will compile and link successfully, it will execute till the first
printf() statement and we will get the message in this statement, as soon as the next
statement is executed we get a runtime error of “Divide by zero” and the program
halts. Such kinds of errors are runtime errors.
*/
