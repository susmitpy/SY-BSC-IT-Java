import java.util.Scanner;


class SOD
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s = sc.nextLine();
		char[] arr = s.toCharArray();
		System.out.println("Sum Of Digits: " + getSum(arr));
	}

        static int getSum(char[] arr){
		int sum=0;
		for (char c : arr){
			sum += Character.getNumericValue(c);
		}
		return sum;
	}
}