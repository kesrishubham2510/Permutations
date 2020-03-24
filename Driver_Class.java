import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Driver_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String or text whose Permutations u wish to find");
		String input=sc.nextLine();
		Permute GivenInput = new Permute(input);
				
	}

}
