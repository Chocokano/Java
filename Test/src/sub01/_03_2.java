package sub01;


public class _03_2{

	public static void main(String[] args) {


		int n = 4;

		for(int i=0; i<n; i++) {
			

			for(int j=n-1; j>i ; j--) {
				System.out.print("☆");
			}
			for(int j=0; j<2 * i + 1 ; j++) {
				System.out.print("★");


			}for(int j=n-1; j>i ; j--) {
				System.out.print("☆");
			}
			System.out.print("\n");

		}

	}

}