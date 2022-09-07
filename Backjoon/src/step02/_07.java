package step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/07
 * 이름 : 최아영
 * 내용 : 2단계 7번 : 주사위 세개
 */
public class _07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
 
		if (a != b && b != c && a != c) {
			int max;
			if (a > b) {
				if (c > a) {
					max = c;
				}else {
					max = a;
				}
			}else {
				if (c > b) {
					max = c;
				}else {
					max = b;
				}
			}
			System.out.println(max * 100);
		}
		else {
			if (a == b && a == c) {
				System.out.println(10000 + a * 1000);
			}else {
				if(a == b || a == c) {
					System.out.println(1000 + a * 100);
				}else {
					System.out.println(1000 + b * 100);	
				}
			}
		}
	}
}