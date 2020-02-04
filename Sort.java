import java.util.Scanner;

class Sort {
	int[] arr = new int[5];
	int[] ans = new int[5];
	
	void asc(){
		int temp;
		ans = arr;
		for (int i = 0; i < 5; i++) {
            		for (int j = i + 1; j < 5; j++) {
                		if (ans[i] > ans[j]){
                 		   	temp = ans[i];
                    			ans[i] = ans[j];
                    			ans[j] = temp;
               			}
            		}
        	}
	}

	void desc(){
		int temp;
		ans = arr;
		for (int i = 0; i < 5; i++) {
            		for (int j = i + 1; j < 5; j++) {
                		if (ans[i] < ans[j]){
                 		   	temp = ans[i];
                    			ans[i] = ans[j];
                    			ans[j] = temp;
               			}
            		}
        	}
	}

	void getArray(){
		Scanner sc = new Scanner(System.in);
		print("Enter 5 Integers");
		for(int i=0; i<5; i++){
			arr[i] = sc.nextInt();
		}
	}

	void printSortedArray(){
		for(int i=0; i<5; i++){
			print(String.valueOf(ans[i]));
		}
	}

	void print(String s){
		System.out.println(s);
	}

	

	public static void main(String [] args){
		Sort S = new Sort();
		S.getArray();
		S.print("Ascending: ");
		S.asc();
		S.printSortedArray();
		S.print("Descending: ");
		S.desc();
		S.printSortedArray();	
	}

}