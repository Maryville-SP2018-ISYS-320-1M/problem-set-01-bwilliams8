import java.util.Scanner;

/*
	ISYS 320
	Name(s):Brian Williams
	Date: 4/1/2018
*/

public class P9_ATMDispenser {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("How much would you like to withdraw? ");
		int moneyInsert = console.nextInt();
		int oneDollars;
		int tenDollars;
		
		for(tenDollars = 0; moneyInsert >= 10; tenDollars++) {
			moneyInsert -= 10;
		}
		for(oneDollars = 0; moneyInsert > 0; oneDollars++) {
			moneyInsert -= 1;
		}
		
		System.out.print("Now dispensing " + tenDollars + " Ten Dollar Bills, and " + oneDollars + " One Dollar Bills.");
	}

}

