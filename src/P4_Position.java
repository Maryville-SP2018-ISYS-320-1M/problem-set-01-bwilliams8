/*
  	ISYS 320
  	Name(s):Brian Williams
  	Date: 4/1/2018
*/

public class P4_Position {

	public static void main(String[] args) {
		
		double s0;
		double v0;
		double a;
		double t;
		
		s0 = 10;
		v0 = 5;
		a = 6;
		t = 3;
		
		position(s0, v0, a, t);
		
	}
	
	public static double position(double s0, double v0, double a, double t) {
		double s = s0 + (v0 * t) + Math.pow((0.5 * a * t), 2);
		System.out.print(s);
		return(s);
	}

}
