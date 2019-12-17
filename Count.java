import java.util.Scanner;

class Count
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = sc.nextLine();
		int l = s.length();
		int lc=0, spacec=0, nc=0, specialc = 0;
		for(int i = 0; i<l; i++){
			char c = s.charAt(i);
			int t = Character.getType(c);
			if (t == 1 || t == 2){lc++;}
			else if (t == 9){nc++;}
			else if (t == 12){spacec++;}
			else {specialc++;}
		}
		System.out.println("Letters: " + lc);
		System.out.println("Spaces: " + spacec);
		System.out.println("Numbers: " + nc);
		System.out.println("Special: " + specialc);
		
	}

}