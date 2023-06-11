import java.util.Scanner;

//Change to main
public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int x = fs.nextInt(), y = fs.nextInt();
			System.out.println(x / (2 * y));
		}
		fs.close();
	}
}
