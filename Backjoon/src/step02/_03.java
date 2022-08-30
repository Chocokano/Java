package step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/31
 * 이름 : 최아영
 * 내용 : 2단계 3번 : 윤년
 */

public class _03 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		

		int y = in.nextInt();
		
        
		if(y%4==0) {
			
			if(y%400==0) System.out.println("1");
			
			else if(y%100==0) System.out.println("0");
			
			else System.out.println("1");
		}
		
		else System.out.println("0");
		
	}
}