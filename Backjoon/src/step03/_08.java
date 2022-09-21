package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/21
 * 이름 : 최아영
 * 내용 : 3단계 8번 : 별 찍기 - 1
 */
public class _08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		sc.close();
 
		for (int i = 1; i <= t; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}