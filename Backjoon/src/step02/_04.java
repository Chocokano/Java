package step02;

import java.util.Scanner;
/*
 * 날짜 : 2022/09/01
 * 이름 : 최아영
 * 내용 : 2단계 4번 : 사분면 고르기
 */


public class _04 {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
        
		int X = in.nextInt();
		int Y = in.nextInt();
		
		if(X > 0) {
			if(Y > 0) {
				System.out.print(1);
			} 
			else {
				System.out.print(4);
			}
		} 
		
		else {
			if(Y > 0) {
				System.out.print(2);
			} 
			else {
				System.out.print(3);
			}
		}
	}
 
}