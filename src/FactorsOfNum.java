import java.util.Scanner;

//To print Factors of a given number 
public class FactorsOfNum {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n = sc.nextInt();
		System.out.println("The factors of "+n+" are: ");
		for(int i=1;i<=n;i++) {
			if(n%i == 0) {
				System.out.println(i);
			}
		}
	}

}
