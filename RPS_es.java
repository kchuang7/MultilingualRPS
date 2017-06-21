import java.util.Scanner;

public class RPS_es {

	public static void juego() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("-----------------------\nRPS_es - Spanish\n-----------------------");
		
		String[] o = {"Tú ganas!", "Tú pierdes!", "Las tablas!", " > ", " < ", " = "},
				 rps = {"piedra", "papel", "tijera"};
		
		System.out.print("(1) piedra, (2) papel, (3) tijera: ");
		
		// 0 = piedra, 1 = papel, 2 = tijera
		int a = s.nextInt() - 1,
			b = (int) (Math.random() * 3),
			r = (a - b + 2) % 3;
		
		System.out.println(rps[a] + o[r + 3] + rps[b] + ". " + o[r]);
		
	}

}