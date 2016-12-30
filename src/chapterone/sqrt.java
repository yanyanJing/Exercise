package chapterone;

public class sqrt {
	
	/*
	public static double sqrt(double c){
		if (c < 0) return Double.NaN;
		int count = 0;
		double err = 1e-15;
		double t = c;
		while (Math.abs(t-c/t) > err*t)
		{
			t = (c/t + t)/2;
			count++;
		}
		System.out.println(count);
		return t;
	}
	*/
	public static double sqrt(double c){
		if (c <= 0.0) return Double.NaN;
		int count = 1;
		double guess = c;
		double err = 1e-15;
		double diff = guess*guess - c;
		while (Math.abs(diff) > err )
		{
			guess = guess - diff/2*guess;
			diff = guess*guess - c;
			count++;
		}
		return guess;
	}
	
	public static void main(String[] args){
		System.out.println(sqrt(10.0));
	}

}
