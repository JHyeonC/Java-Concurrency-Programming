package chapter02;

public class TerminatedStateThreadExample {
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("스레드 실행 중");
			}
		});
		thread.start();
		thread.join(); // 스레드가 다 종료될 때까지 대기
		System.out.println("스레드 상태 : " + thread.getState());
	}
}
