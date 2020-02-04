abstract class A {
	public static final int salary = 10000;
	abstract void getTotalSalary();	

}


class Ab extends A{
	int bonus = 5000;

        void getTotalSalary(){
		System.out.println("Total Salary: " + (salary+bonus));		
	} 
	
	public static void main(String[] args){
		Ab a = new Ab();		
		a.getTotalSalary();
	}

}