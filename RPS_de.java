import java.util.Scanner;

public class RPS_de {

	public static void spiel() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("-----------------------\nRPS_de - German\n-----------------------");
		
		String[] o = {"der Sieg!", "der Verlust!", "das Unentschieden!", " > ", " < ", " = "},
				 rps = {"schere", "stein", "papier"};
		
		System.out.print("(1) schere, (2) stein, (3) papier: ");
		
		// 0 = schere, 1 = stein, 2 = papier
		int a = s.nextInt() - 1,
			b = (int) (Math.random() * 3),
			r = (a - b + 2) % 3;
		
		System.out.println(rps[a] + o[r + 3] + rps[b] + ". " + o[r]);
		
	}

}