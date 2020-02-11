class Rt implements Runnable {
	public void run(){
		System.out.println("Thread running using runnable");
	}

	public static void main(String[] args){
		Rt r = new Rt();
		Thread t = new Thread(r);
		t.start();
	}

}