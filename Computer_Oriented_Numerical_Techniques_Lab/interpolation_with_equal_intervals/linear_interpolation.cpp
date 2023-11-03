#include <stdio.h>

int main() {
	float x1, y1, x2, y2, x, y, k1, k;
	printf("ENTER THE FIRST NODAL VALUE(X1):");
	scanf("%f",&x1);
	printf("\nENTER THE FUNCTION VALUE AT X1(Y1=F(X1)):");
	scanf("%f",&y1);
	printf("\nENTER THE SECOND NODAL VALUE(X2):\n");
	scanf("%f",&x2);
	printf("\nENTER THE FUNCTION VALUE AT X2(Y2=F(X2)):");
	scanf("%f",&y2);
	printf(" \n");
	printf("\nENTER THE VALUE OF NODE X(BETWEEN X1 & X2):");
	scanf("%f",&x);
	k = (x-x1)/(x2-x1);
	k1 = k*(y2-y1);
	y = (y1+k1);
	printf("\nTHE INTERPOLATED VALUE OF Y = F(X): %f", y);


	return 0;
}