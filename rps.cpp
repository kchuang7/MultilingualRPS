#include <iostream>
#include <string>
#include <stdlib.h>

int main()
{
	std::cout << "Rock Paper Scissors\n";

	std::string o[] = {"Win!", "Loss!", "Tie!", " > ", " < ", " = "};
	std::string rps[] = {"rock", "paper", "scissors"};

	std::cout << "(1) rock, (2) paper, (3) scissors: ";

	int a;
	std::cin >> a;
	a--;
	int b = rand() % 3; // AI choice
	int r = (a - b + 2) % 3; // calculate outcome of game

	std::cout << rps[a] << o[r + 3] << rps[b] << ". " << o[r];
}