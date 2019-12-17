import java.util.Scanner;


class SOD
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array: ");
		int n = sc.nextInt();
		char[] arr = new char[n];
		System.out.format("Enter %d elements: ", n);
		sc.nextLine();
		for(int i = 0; i<n; i++){
			String s = sc.nextLine(); 
			arr[i] = s.charAt(0);
		}
		
		System.out.println("Sum Of Digits: " + getSum(arr));
	}

        static int getSum(char[] arr){
		int sum=0;
		for (char c : arr){
			sum += Integer.parseInt(String.valueOf(c)); 
		}
		return sum;
	}
}