using System;



class RPS {


	static void Main() {

		Console.WriteLine("Rock Paper Scissors");


		string[] o = {"Win!", "Loss!", "Tie!", " > ", " < ", " = "},
			 rps = {"rock", "paper", "scissors"};


		Console.Write("(1) rock, (2) paper, (3) scissors: ");

		Random rand = new Random();

		// 0 = rock, 1 = paper, 2 = scissors

		int a = Console.Read() - 49, // convert ASCII representation to integer
		    b = rand.Next(0, 3),
		    r = (a - b + 2) % 3;

		Console.WriteLine(rps[a] + o[r + 3] + rps[b] + ". " + o[r]);

	}

}