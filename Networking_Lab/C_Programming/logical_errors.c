/* Program to compute average of three numbers */
#include<stdio.h>
int main( )
{
	int a,b,c,sum,avg;
	a=10;
	b=5;
	c=20;
	sum = a+b+c;
	avg = sum / 3;
	printf("The average is %d\n", avg);
	return 0;
}

/* The exact value of average is 8.33 and the output we got is 8. So we are not getting
the actual result, but a rounded off result. This is due to the logical error. We have
declared variable avg as an integer but the average calculated is a real number,
therefore only the integer part is stored in avg. Such kinds of errors which are not
detected by the compiler or the linker are known as logical errors.
The third kind of error is only detected during execution. Such errors are known as
run time errors. These errors do not produce the result at all. The program execution
stops in between and a run time error message are flashed on the screen. Let us look
at the following example:
*/
