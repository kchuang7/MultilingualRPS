import java.util.Scanner;

public class RPS_ja {

	public static void ゲーム() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("-----------------------\nRPS_ja - Japanese\n-----------------------");
		
		String[] o = {"勝つ!", "負け!", "あいこでしょ!", " > ", " < ", " = "},
				 rps = {"グー", "パー", "チョキ"};
		
		System.out.print("じゃん拳ぽん ((1) グー, (2) パー, (3) チョキ): ");
		
		// 0 = グー, 1 = パー, 2 = チョキ
		int a = s.nextInt() - 1,
			b = (int) (Math.random() * 3),
			r = (a - b + 2) % 3;
		
		System.out.println(rps[a] + o[r + 3] + rps[b] + ". " + o[r]);
		
	}

}