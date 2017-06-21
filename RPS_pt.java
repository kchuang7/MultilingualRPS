import java.util.Scanner;

public class RPS_pt {

	public static void jogo() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("-----------------------\nRPS_pt - Portuguese\n-----------------------");
		
		String[] o = {"Vitória!", "Perda!", "Empate!", " > ", " < ", " = "},
				 rps = {"pedra", "papel", "tesoura"};
		
		System.out.print("(1) pedra, (2) papel, (3) tesoura: ");
		
		// 0 = pedra, 1 = papel, 2 = tesoura
		int a = s.nextInt() - 1,
			b = (int) (Math.random() * 3),
			r = (a - b + 2) % 3;
		
		System.out.println(rps[a] + o[r + 3] + rps[b] + ". " + o[r]);
		
	}

}