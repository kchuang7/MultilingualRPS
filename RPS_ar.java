import java.util.Scanner;

public class RPS_ar {

	public static void مباراة() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("-----------------------\nRPS_ar - Arabic\n-----------------------");
		
		String[] o = {"فوز", "هزيمة", "تعادل", " > ", " < ", " = "},
				 rps = {"حجر", "ورقة", "مقص"};
		
		System.out.print(rps[0] + " (1) " + rps[1] + " (2) " + rps[2] + " (3): ");
		
		// 0 = حجر
		// 1 = ورقة
		// 2 = مقص
		int a = s.nextInt() - 1,
			b = (int) (Math.random() * 3),
			r = (a - b + 2) % 3;
		
		System.out.println(rps[a] + o[r + 3] + rps[b] + ". " + o[r]);
		
	}

}