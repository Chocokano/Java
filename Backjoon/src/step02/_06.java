package step02;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/05
 * 이름 : 최아영
 * 내용 : 2단계 6번 : 오븐시계
 */
public class _06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
        int B = sc.nextInt();
 
        int C = sc.nextInt();
 
        int min = 60 * A + B;   // 시 -> 분
        min += C;
 
        int hour = (min / 60) % 24;
        int minute = min % 60;
 
        System.out.println(hour + " " + minute);
	}
}
