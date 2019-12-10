import java.util.Scanner;
class Reverse{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = sc.nextLine();
		System.out.println("Reversed: " + revStr(s));
	}

	static String revStr(String s){
		//To Array
		char[] arr = new char[s.length()];
		

		// Filled Reverse  array
		int i = 0;
		char t;
		int e = s.length()-1;
		
		while(i<e){
			arr[i] = s.charAt(e);
			arr[e] = s.charAt(i);
			i++;
			e--;
		}		

		//To String
		String rev = "";
		for (char c : arr){
			rev += c;
		}

		return rev;
	}

}