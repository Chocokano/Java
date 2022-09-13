package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/08
 * 이름 : 최아영
 * 내용 : 3단계 1번 : 주사위 세개 구구단
 */
public class _01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	int a = sc.nextInt();
		
		for(int i = 1; i<10; i++) {
			System.out.println(a+" * "+i+" = "+(a*i));
		}
	}
}