#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main()

{
	printf("Rock Paper Scissors\n");

	char o[][6] = {"Win!", "Loss!", "Tie!", ">", "<", "="};
	char rps[][9] = {"rock", "paper", "scissors"};

	printf("(1) rock, (2) paper, (3) scissors: ");

	srand(time(NULL)); // run once

	int a = getchar() - 49; // convert ASCII to integer then subtract 1
	int b = rand() % 3; // AI choice
	int r = (a - b + 2) % 3; // calculate outcome of game

	if (a != EOF)
		printf("%s %s %s. %s\n", rps[a], o[r + 3], rps[b], o[r]);

	return 0;
}