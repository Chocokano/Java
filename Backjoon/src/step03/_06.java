package step03;

import java.util.Scanner;
/*
 * 날짜 : 2022/09/20
 * 이름 : 최아영
 * 내용 : 3단계 6번 : A+B - 7
 */

public class _06 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) {


			int c = sc.nextInt();
			int d = sc.nextInt();

			System.out.println("Case #" + i + ": " + (c + d));
		}

		sc.close();
	}
}