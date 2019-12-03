import java.util.Scanner;
class Circle
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius: ");
		float r = sc.nextFloat();
		System.out.println("Perimeter: " + 2*Math.PI*r);		
		System.out.println("Area: " + r*Math.PI*r);
	}
}