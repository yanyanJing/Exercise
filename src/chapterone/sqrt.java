package chapterone;

public class sqrt {
	
	
	public static double sqrt(double c){
//		其实牛顿开方法是牛顿迭代法在开平方上的应用，牛顿迭代法同时也能快速逼近很多方程的解，自然可以用来开任意平方。
//		求a的开方，即求x^2-a=0的正根。
//
//		更一般地，求a的k次开方，即求x^k-a=0的正根。
//
//		注意牛顿迭代法只能逼近解，不能计算精确解。不过实际应用中，我们都不要求绝对精确的解，例如计算器得出结果也不需要给出无限位，只需要给出十几位小数就足够了，所以牛顿迭代法被广泛用在各种科学计算中。
//
//		【牛顿迭代法】
//
//		假设方程 f(x)=0在 x0 附近有一个根，那么用以下迭代式子：
//		xn+1 = xn - f(xn)/f`(xn) 导数
//		依次计算x1、x2、x3、……，那么序列将无限逼近方程的根。
//
//		牛顿迭代法的原理很简单，其实是根据f(x)在x0附近的值和斜率，估计f(x)和x轴的交点，看下面的动态图：
//		【用牛顿迭代法开平方】
//
//		令：
//		f(x) = x^2 - a
//		所以f(x)的一次导是：
//		f`(x) = 2x
//		牛顿迭代式：
//		xn+1 = xn - (xn^2 -a)/2xn = (xn+a/xn)/2
//
//		随便一个迭代的初始值，例如x0=1，代入上面的式子迭代。
//
//		例如计算2的开方，即a=2。
//		x0=1
//		x1 = (1 + 2/1)/2 = 1.5
//		x2 = (1.5 + 2/1.5)/2 = 1.4166
//		……
//
//
//		计算器上可给出2的开方=1.4121356
//
//		【用牛顿迭代法开任意次方】
//
//		求a的k次开方的递推式是：
//		xn+1 = xn - (xn^k-a)/kxn^(k-1) = (k-1)/k*xn + a/k(xn(k-1))
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
	
	
	/* http://www.cnblogs.com/shrimp-can/p/4868343.html
	 * http://blog.csdn.net/windsnow263/article/details/53840533
	 * http://blog.csdn.net/majishushu/article/details/52841758
	 * http://www.guokr.com/question/461510/
	 * https://www.zhihu.com/question/20690553
	 * 
	 */
//	public static double sqrt(double c){
//		if (c <= 0.0) return Double.NaN;
//		int count = 1;
//		double guess = c;
//		double err = 0.01;//1e-15
//		double diff = guess*guess - c;
//		System.out.println("guess:"+guess+", diff:"+diff+", count:"+count);
//		while (Math.abs(diff) > err )
//		{
//			guess = guess - diff/(2*guess);
//			diff = guess*guess - c;
//			count++;
//			System.out.println("guess:"+guess+", diff:"+diff+", count:"+count);
//		}
//		System.out.println("guess:"+guess+", iteration:"+count);
//		return guess;
//	}
	
	public static void main(String[] args){
		System.out.println(sqrt(10.0));
	}

}
