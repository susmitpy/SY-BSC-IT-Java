class Th extends Thread {
	@Override
	public void run(){
		System.out.println("Running Thread: " + Thread.currentThread().getId());
	}
}

class Mul {
	public static void main(String[] args){
		for (int i =0; i <5; i++){
			Thread t = new Th();
			t.start();
		}
	}
}