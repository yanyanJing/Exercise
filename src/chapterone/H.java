package chapterone;

public class H {
	//  [计] harmonic progression; harmonic series
	/*
	 * 1+1/2+1/3+1/4+....
	 * 调和级数有限项和:1+1/2+1/3+....+1/n = ln(n+1)+r,r是欧拉常数
	 * 因ln(1+n) = n - n^2/2 + n^3/3 - n^4/4 + n^5/5+.....
	 * so ln(1+1/x) = 1/x - 1/2x^2 + 1/3x^3 - 1/4x^4 +...
	 *    1/x = ln(1+1/x) + 1/2x^2 - 1/3x^3 + 1/4x^4 -....
	 *    令x = 1,2,3,...,n.
	 *    1/1 = ln(2) + 1/2 - 1/3 + 1/4 -1/5 + ...
	 *    1/2 = ln(3/2) + 1/2*4 - 1/3*8 + 1/4*16 - ...
     *    ......
	 *    1/n = ln((n+1)/n) + 1/2n^2 - 1/3n^3 + ...
     *    相加，就得到：
	 *    1+1/2+1/3+1/4+...1/n = ln(n+1) + 1/2*(1+1/4+1/9+...+1/n^2) - 1/3*(1+1/8+1/27+...+1/n^3) + ......
	 *    后面那一串和都是收敛的，我们可以定义
	 *    1+1/2+1/3+1/4+...1/n = ln(n+1) + r
	 *    Euler近似地计算了r的值，约为0.5772156649。这个数字就是后来称作的欧拉常数。
	 *    
	 *    lnx+lny=ln(xy)  lne=1  ln1=0  
	 */
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
