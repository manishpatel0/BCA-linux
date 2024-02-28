#include <stdio.h>
#include <math.h>


int main() {
	int digit =0;
	printf("\n\tCude of\t UsingMuliplication\tPowerFunction");
	while(digit < 10) {
		printf("\n\t%d\t\t%d\t\t\t\t%d",digit,digit*digit*digit,(int)pow(digit,3),pow(digit,3));
		digit++;
	}
//	getch();
	return 0;
}
