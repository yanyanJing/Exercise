package chapterone;

public class H {
	//  [计] harmonic progression; harmonic series
	public static int H(int N) {
		int sum = 0;
		for(int i = 0; i < N; i++ )
			sum += 1/i;
		return sum;
	}
	
	public static void main(String[] args){
		System.out.println(H(100));
	}
}
