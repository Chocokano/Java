package step01;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/19
 * 이름 : 최아영
 * 내용 : 1단계 12번 : 곱셈
 */

public class _12 {
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int c = (b % 10) * a;
			int d = ((b % 100) / 10) * a;
			int e = (b / 100) * a;
			
			System.out.println(c);
			System.out.println(d);
			System.out.println(e);
			System.out.println(a * b);
			
		}

	}


