import java.util.Scanner;

class Conversion{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Decimal no. ");
		int n = sc.nextInt();
		System.out.println("Binary: " + decToBin(n));
		System.out.println("Enter Binary no. ");
		int b = sc.nextInt();
		String bin = String.valueOf(b);
		System.out.println("Decimal: " + String.valueOf(binToDec(bin)));
	}

	static String decToBin(int n){
		String b = "";
		int r,q;
		while (n!=0){
			r = n % 2;
			b = String.valueOf(r)+ b;  
			n /= 2;
		}
		return b;
	}

	static int binToDec(String b){
		int n = 0;		
		char c;
		double msb = Math.pow(2,b.length()-1);
		for (int i =0; i < b.length();i++){
			c = b.charAt(i);
			if (c=='1'){
				n+=msb;
			}
			msb /= 2;
		}
		return n;
	}
}


/*
12 : 1100

op	quotient   remainder	  bin
12/2	  6		0	   0
6/2       3             0          00
3/2	  1 		1	   100
1/2	  0		1 	   1100		

6: 32 16 8 4 2 1
4: 8 4 2 1
5: 16 8 4 2 1
*/