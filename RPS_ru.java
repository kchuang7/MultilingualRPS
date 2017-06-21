import java.util.Scanner;

public class RPS_ru {

	public static void игра() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("-----------------------\nRPS_ru - Russian\n-----------------------");
		
		String[] o = {"победа!", "потеря!", "ничья!", " > ", " < ", " = "},
				 rps = {"камень", "бумага", "ножницы"};
		
		System.out.print("Раз-Два-Три ((1) камень, (2) бумага, (3) ножницы): ");
		
		// 0 = камень, 1 = бумага, 2 = ножницы
		int a = s.nextInt() - 1,
			b = (int) (Math.random() * 3),
			r = (a - b + 2) % 3;
		
		System.out.println(rps[a] + o[r + 3] + rps[b] + ". " + o[r]);
		
	}

}