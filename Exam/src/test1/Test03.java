package test1;
/*
 * 날짜 : 2022/08/19
 * 이름 : 최아영
 * 내용 : Java 연산자 연습문제
 */

import javax.naming.spi.DirStateFactory.Result;

public class Test03 {
	public static void main(String[] args) {

		int num = 1;
		int result = 0;

		result = num++;


		System.out.println("result : " +result);

		result = ++num;
		System.out.println("result : " +result);

		result = num--;
		System.out.println("result : " +result);

		result = --num;
		System.out.println("result : " +result);

	}
}
