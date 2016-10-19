import java.io.*;
import java.util.*;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		Scanner n1 = new Scanner (System.in);
		while (count<10) {
			System.out.print ("Type in a sentence and press ENTER. ");
			String input = n1.nextLine();
			input = input.toUpperCase();
			if (input.equals("EXIT")) {
				break;
			}
			else {
				input = input.concat(".");
				String sp[] = input.split("SA|S\\s+A");
				int ans = sp.length-1;
				System.out.println ("There are " + ans + " occurences.");
			}
		}
	}

}
