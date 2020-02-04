import java.lang.Object;

class ConDes extends Object {
	ConDes (){
		System.out.println("Constructor Called");
	}
	
	@Override
	protected void finalize(){
		System.out.println("Destructor Called");
	}

	public static void main(String[] args){
		ConDes c = new ConDes();
		c = null;
		System.gc();
	}
	

}