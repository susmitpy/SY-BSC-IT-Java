import java.util.Scanner;

class Exp1 {
	public static void main(String[] args){
		int a[] = {1,2,3};
		System.out.println("Array: ");
		for (int i : a) System.out.print(i + " ");
		try {
			System.out.println("\nAccesing Index 3");
			int b = a[3];
		} catch(ArrayIndexOutOfBoundsException	 e){
			  System.out.println("Index not in bounds");
		}
		finally {
			System.out.println("Finally!");
		
		}
		

	}	


}