import java.util.Scanner;
class Smallest	{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 3 numbers: ");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int t=((a<=b)?((b<=c)?a:((a<=c)?a:c)):((c<b)?c:b)); 
	System.out.println(String.valueOf(t));
	}
}