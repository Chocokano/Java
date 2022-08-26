package step01;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/26
 * 이름 : 최아영
 * 내용 : 1단계 11번 : 나머지
 */

public class _11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		System.out.println((num1 + num2)%num3);
		System.out.println(((num1 % num3) + (num2%num3))%num3);
		System.out.println((num1 * num2)%num3);
		System.out.println(((num1 % num3) * (num2%num3))%num3);
		
	
	}

}

