package chapter02;

public class SIngleThreadAppTerminatedExample {
	public static void main(String[] args){
		int sum = 0;
		for(int i=0; i<1000; i++){
			sum = sum + i;
		}

		System.out.println("sum : " + sum);
		System.out.println("메인스레드 종료");
	}
}
