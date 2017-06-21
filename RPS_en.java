import java.util.Scanner;

public class RPS_en {

	public static void game() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("-----------------------\nRPS_en - English\n-----------------------");
		
		String[] o = {"Win!", "Loss!", "Tie!", " > ", " < ", " = "},
				 rps = {"rock", "paper", "scissors"};
		
		System.out.print("(1) rock, (2) paper, (3) scissors: ");
		
		// 0 = rock, 1 = paper, 2 = scissors
		int a = s.nextInt() - 1,
			b = (int) (Math.random() * 3),
			r = (a - b + 2) % 3;
		
		System.out.println(rps[a] + o[r + 3] + rps[b] + ". " + o[r]);
		
	}

}