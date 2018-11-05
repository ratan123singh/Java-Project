import java.util.Scanner;
import java.util.*;

public class Pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter as your wish Number");
		int n = sc.nextInt();
		int i, j, space = 4, k;

		for (i = 1; i <= n; i++) {
			for (j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (k = 1; k <= i; k++) {
				System.out.print(" *");
			}
			System.out.println(" ");
			space--;
		}
	}
}