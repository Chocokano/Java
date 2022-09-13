package step03;

import java.util.Scanner;

/*
 * 날짜 : 2022/09/13
 * 이름 : 최아영
 * 내용 : 3단계 2번 : A+B - 3
 */

public class _02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int c = sc.nextInt();
		int arr[] = new int[c];

		for (int i = 0; i < c; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			arr[i] = a + b;
		}

		for (int k : arr) {
			System.out.println(k);
		}
	}
}

