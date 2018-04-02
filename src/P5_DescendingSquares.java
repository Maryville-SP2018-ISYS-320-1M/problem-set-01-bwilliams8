import java.util.Collections;

/*
  	ISYS 320
  	Name(s):Brian Williams
  	Date: 4/1/2018
*/

/* 6. Your pseudocode algorithm here
Create an array filled with 1*1, 2*2, etc.
Collections.reverse(array)
print array.
*/

public class P5_DescendingSquares {

	public static void main(String[] args) {
		// 7. Your program code here
		int[] squares = new int[args.length];
		for (int i = 0; i < 10; i++) {
			int square = i * i;
			square = Integer.parseInt(args[i]);
			squares[i] = square;
		}
// I'm being thrown an exception any time i run this, and i'm absolutely stumped as to why. It looks fine to me, I asked a java-capable friend of mine for advice, he blamed the compiler. I'm moving on from this correct or otherwise though.		
		Collections.reverse(squares);
		System.out.print(squares);
	}

}
