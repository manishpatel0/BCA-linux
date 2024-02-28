#include <stdio.h>
// #include <conin.h>
#include <math.h>

int digitcube(int);		// Function to seperate digits, Cube thme and add the cubes.

int main(){
	int number;
	printf("\n\t Enter a Positive Number\n");
	scanf("%d",&number);
	if(number <= 1) 
		printf("The Number is One or Less than 1. Try again\n");
	else if(number == digitcube(number))
		printf("\n\tThe number %d is an Armstrong Number\n", number);
	else
		printf("\n\tThe number %d is NOT an Armstrong Number\n", number);	
	// getch();
	return 0;	
}			//main ends

int digitcube(int num) {
	int sum=0,digit;
	while(num != 0) {
		digit = num%10; 		//separate a digit
		sum = sum + (int)pow(digit,3);		// use power function to perform cube of digit
				// Note pow function  users float paramaters and return float
		num = num/10;

	}
	return sum;
	
}