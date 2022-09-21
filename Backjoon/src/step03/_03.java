package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/15
 * 이름 : 최아영
 * 내용 : 3단계 3번 : 합
 */

public class _03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		sc.close();
		
		int sum = 0;

		for (int i = 1; i <= a; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}