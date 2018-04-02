/*
  	ISYS 320
  	Name(s):Brian Williams
  	Date: 4/1/2018
*/

/* 4. Your pseudocode algorithm here
	Outer for-loop to determine the rows of stars
	Inner for-loop to determine the columns of stars
	Print stars
	Print line

*/
public class P7_NestedLoopBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 6; i++) {
			for(int n = 0; n < 6; n++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
