package sub01;

/*
 * 날짜 : 2022/08/16
 * 이름 : 최아영
 * 내용 : Jave 변수 실습하기 교재 p???
 * 
 * 변수(Variable)
 *  -데이터를 처리하기 위한 메모리 공간
 *  -데이터 변경이 가능
 *  
 *  상수(Constant)
 *  -데이터 변경이 불가능한 고정된 값을 갖는 변수
 */
public class VariableTest {
	
	public static void main(String[] args) {

		//변수
		String Hello = "Hello World";
		int a = 3 ;
		int b = 7 ;
		
		System.out.println("Hello : " + Hello);
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		//상수
		final int NUM = 5 ;
		//*NUM = 7;
		
		System.out.println("NUM : " + NUM);
		
	}
}
