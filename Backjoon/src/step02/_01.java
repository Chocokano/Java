package step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/29
 * 이름 : 최아영
 * 내용 : 2단계 1번 : 두 수 비교하기
 */
public class _01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		
		in.close();
		
		if(a>b)System.out.println(">");
		else if (a<b) System.out.println("<");
		else System.out.println("==");
		
	}
}
