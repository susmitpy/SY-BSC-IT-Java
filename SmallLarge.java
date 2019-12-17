import java.util.Scanner;


class SmallLarge
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.format("Enter %d elements: ", n);
		for(int i = 0; i<n; i++){
			arr[i] = sc.nextInt();
		}

		int min = Integer.MAX_VALUE; 
		int max = Integer.MIN_VALUE; 
		for(int e : arr){
			if(e < min){
				min=e;
			}
			if(e>max){
				max=e;
			}
		}

		System.out.format("Min: %d\nMax: %d",min,max);

	}


}