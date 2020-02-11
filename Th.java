class Th extends Thread {
	@Override
	public void run(){
		System.out.println("Thread Running");
	}

	public static void main(String[] args){
		Th t = new Th();
		t.start();
	}

}