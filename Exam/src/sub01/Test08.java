package sub01;
/*
 * 날짜 : 2022/08/19
 * 이름 : 최아영
 * 내용 : Java 반복문 연습문제
 */

public class Test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		
		for(int i=0; i<n; i++) {
			
	
			for(int j=n-1; j>i ; j--) {
			 System.out.print(" ");
		}
			for(int j=0; j<2 * i + 1 ; j++) {
				System.out.print("*");
				
			}
			System.out.print("\n");
			
		}

	}

}