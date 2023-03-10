
public class N203 {
	public static boolean LaChan(int n) {
		if (n % 2 == 0)
			return true;
		return false;
	}
	public static void PTB2(float a, float b, float c) {
		double delta = Math.pow(b, 2) - 4 * a * c;
		if (delta < 0)
			System.out.print("PT vo nghiem");
		else if (delta == 0)
			System.out.print("PT co nghiem kep la: " + (-b/2*a));
		else {
			double x1 = (-b-Math.sqrt(delta))/2*a;
			double x2 = (-b+Math.sqrt(delta))/2*a;
			System.out.printf("PT co 2 nghiem x1 = %f, x2 = %f", x1,x2);
			
		}
	}
	public static long GT(int n) {
		long s = 1;
		for(int i = 1;i<=n;i++)
			s *=i; // s = s * i;
		return s;
	}
	public static long DQGT(int n) {
		if (n == 0) return 1;
		return n * DQGT(n-1);
	}
	public static long Fibo(int n) {
		long f0 = 0, f1 = 1;
		long f2 = 1;
		if (n < 1)
			return 0;
		for(int i = 2;i<=n;i++)
		{
			f2 = f0 + f1;
			f0 = f1;
			f1 = f2;
		}
		return f2;
	}
}
