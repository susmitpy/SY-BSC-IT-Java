import java.util.Scanner;
class Reverse{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = sc.nextLine();
		System.out.println("Reversed: " + revStr(s));
	}
	static String revStr(String s){
		String rev = "";
		for (int i=0; i<s.length();i++){
			rev = s.charAt(i) + rev;
		}
		return rev;
	}
}