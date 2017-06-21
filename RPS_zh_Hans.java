import java.util.Scanner;

public class RPS_zh_Hans {

	public static void 游戏() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("-----------------------\nRPS_zh_Hans - Simplified Chinese\n-----------------------");
		
		String[] o = {"赢!", "输!", "平局!", " > ", " < ", " = "},
				 rps = {"剪刀", "石头", "布"};
		
		System.out.print("(1) 剪刀, (2) 石头, (3) 布: ");
		
		// 0 = 剪刀, 1 = 石头, 2 = 布
		int a = s.nextInt() - 1,
			b = (int) (Math.random() * 3),
			r = (a - b + 2) % 3;
		
		System.out.println(rps[a] + o[r + 3] + rps[b] + ". " + o[r]);
		
	}

}