package chapter02;

public class AnomymousRunnableClassExample {
	public static void main(String[] agrs){
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " : 스레드 실행 중");
			}
		});
		thread.start();
	}
}
