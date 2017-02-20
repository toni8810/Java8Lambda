package io.javabrains;

public class RunnableExample {

	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Hey from thread");
				
			}
			
		});
		t.start();
		Thread t2 = new Thread(() -> System.out.println("Hey from lambda Thread"));
		t2.start();

	}

}
