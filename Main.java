import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		
		String str = "";
		for (int i = a; i <= b; i++) {
			if (isWS(i))
				str += i + " ";
		}
		if (str == "") {
			System.out.println("NIL");
		} else {
			str = str.substring(0, str.length() - 1);
			System.out.println(str);
		}
	}

	static boolean isWS(int n) { 
		int a = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				a += i;
			}
		}
		if (a == n)
			return true;
		else
			return false;
	}
}