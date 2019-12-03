import java.util.Scanner;
class Avg
{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("No. of elems: "); 
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for (int e : arr){   
			sum += e;
		}
		System.out.println("Avg: " + sum/n);
	}
}