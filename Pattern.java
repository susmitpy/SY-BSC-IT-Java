
class Pattern
{
	public static void main(String[] args){
	
		for (int r = 5; r>=1; r--){
			for (int s = 1; s <= 5-r; s++){
				System.out.print(" ");
			}
			for (int c = 0; c < r; c++){
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}