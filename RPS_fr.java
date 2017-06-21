import java.util.Scanner;

public class RPS_fr {

	public static void jeu() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("-----------------------\nRPS_fr - French\n-----------------------");
		
		String[] o = {"La victoire!", "La défaite!", "Le match nul!", " > ", " < ", " = "},
				 rps = {"pierre", "papier", "ciseaux"};
		
		System.out.print("Rochambeau ((1) pierre, (2) papier, (3) ciseaux): ");
		
		// 0 = pierre, 1 = papier, 2 = ciseaux
		int a = s.nextInt() - 1,
			b = (int) (Math.random() * 3),
			r = (a - b + 2) % 3;
		
		System.out.println(rps[a] + o[r + 3] + rps[b] + ". " + o[r]);
		
	}

}