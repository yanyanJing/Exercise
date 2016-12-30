package chapterone;

public class isPrime {
	
	public static boolean isPrime(int N){
		if (N < 2) return false;
		for (int i = 2; i*i < N;i++) //i*i can improve performance.
			if ( N%i == 0 ) return false;
		return true;
	}
	
	public static void main(String[] args){
		boolean flag;
		flag = isPrime(10);
		if (flag) System.out.println("10 is Prime.");
		else System.out.println("10 is not Prime number.");
	}

}
