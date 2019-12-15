import java.util.Scanner;
class Circle
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius: ");
		float r = sc.nextFloat();
		System.out.format("Perimeter: %.3f\n" ,2*Math.PI*r);
		System.out.format("Area: %.3f", Math.PI*r*r);
	}
}