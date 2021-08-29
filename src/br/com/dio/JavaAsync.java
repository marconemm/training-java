package br.com.dio;

public class JavaAsync {

	public static void main(String[] args) {
		Loading loading = new Loading();
		LoadingShort shortTime = new LoadingShort();
		LoadingLong longTime = new LoadingLong();

		loading.run();
		longTime.start();
		shortTime.start();
	}
}

class Loading implements Runnable {

	@Override
	public void run() {
		System.out.println("Loading...");

	}

}

class LoadingLong extends Thread {

	@Override
	public void run() {
		try {
			
			Thread.sleep(6000);
			System.out.println("LoadingLong... on: " + this.getName());
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

	}

}

class LoadingShort extends Thread {

	@Override
	public void run() {
		try {
			
			Thread.sleep(2000);
			System.out.println("LoadingShort... on: " + this.getName());
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

	}

}
