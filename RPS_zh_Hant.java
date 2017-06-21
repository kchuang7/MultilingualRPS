import java.util.Scanner;

public class RPS_zh_Hant {

	public static void 遊戲() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("-----------------------\nRPS_zh_Hans - Traditional Chinese\n-----------------------");
		
		String[] o = {"贏!", "輸!", "平局!", " > ", " < ", " = "},
				 rps = {"剪刀", "石頭", "布"};
		
		System.out.print("(1) 剪刀, (2) 石頭, (3) 布: ");
		
		// 0 = 剪刀, 1 = 石頭, 2 = 布
		int a = s.nextInt() - 1,
			b = (int) (Math.random() * 3),
			r = (a - b + 2) % 3;
		
		System.out.println(rps[a] + o[r + 3] + rps[b] + ". " + o[r]);
		
	}

}