package chapter02;

// 단일 스레드와 멀티 스레드의 차이점. 멀티 스레드는 스레드 중 종료가 되지 않은 스레드가 존재하면 어플리케이션이 종료되지 않는다.
public class MultiThreadAppTerminatedExample {
	public static void main(String[] args){
		for(int i=0; i<3; i++){
			Thread thread = new Thread(new ThreadStackExample.MyRunnable(i));
			thread.start();
		}

		System.out.println("메인 스레드 종료");
	}

	static class MyRunnable implements Runnable{
		private final int threadId;
		public MyRunnable(int threadId){
			this.threadId = threadId;
		}
		@Override
		public void run(){
			System.out.println(Thread.currentThread().getName() + ": 스레드 실행중..");
			firstMethod(threadId);
		}
		private void firstMethod(int threadId){
			int localValue = threadId + 100;
			secondMethod(localValue);
		}
		private void secondMethod(int localValue){
			String objectReference = threadId + ": Hello, world";
			System.out.println(Thread.currentThread().getName() + ": 스레드 ID :" + threadId + ", value : " + localValue);
		}
	}
}
