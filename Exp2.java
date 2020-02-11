import java.util.Scanner;

class Exp2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter age for applying for driving license");
		int n = sc.nextInt();
		if (n < 18) throw new ArithmeticException("Minimum age is 18");
		else  System.out.println("Cleared!");
		

	}	


}