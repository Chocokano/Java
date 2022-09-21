package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/21
 * 이름 : 최아영
 * 내용 : 3단계 7번 : A+B - 8
 */

public class _07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		 
		for (int i = 1; i <= a; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
 
			System.out.println("Case #" + i + ": " + b + " + " + c + " = " + (b+c));
		}
 
		sc.close();
	}
}
