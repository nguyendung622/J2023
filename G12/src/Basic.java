
public class Basic {
	public static boolean LaChan(long n) {
		if (n % 2 == 0)
			return true;
		return false;
	}
	
	public static void PTB2(float a, float b, float c) {
		double delta = Math.pow(b,2) - 4*a*c;
		if (delta < 0)
			System.out.println("PT Vo nghiem");
		else if (delta == 0)
			System.out.println("PT co nghiem kep la: " + (-b/2*a));
		else {
			double x1 = (-b-Math.sqrt(delta))/2*a;
			double x2 = (-b+Math.sqrt(delta))/2*a;
			System.out.printf("Co 2 nghiem, x1 = %f, x2 = %f\n", x1,x2);
		}
	}
	public static long GT(long n) {
		long s = 1;
		for(int i = 1;i<=n;i++)
			s *=i; // s = s * i;
		return s;
	}
	public static long DQ_GT(long n) {
		if (n==0)
			return 1;
		return n * DQ_GT(n-1);
	}
	
	public static long Fibo(long n) {
		long F0 = 0, F1 = 1, F2 = 1;
		if (n == 0)
			return 0;
		for(long i = 2;i<=n;i++) {
			F2 = F1 + F0;
			F0 = F1;
			F1 = F2;
		}
		return F2;
	}
	public static long UCLN(long a, long b) {
		while(a!=b) {
			if (a > b)
				a = a - b;
			else
				b = b - a;
		}
		return a;
	}
	public static long BCNN(long a, long b) {
		return a * b / UCLN(a,b);
	}
	public static boolean LaSNT(long n) {
		if (n < 2)
			return false;
		for(int i = 2; i<n;i++)
			if (n % i ==0)
				return false;
		return true;
	}
	public static int DemChuSo(long n) {
		int dem = 0;
		while(n!=0) {
			n = n / 10;
			dem++;
		}
		return dem;
	}
	public static long TongChuSo(long n) {
		long tong = 0;
		while(n!=0) {
			tong = tong + (n % 10);
			n = n / 10;
		}
		return tong;
	}
	public static void LietKeSNT_NhoHon(long n) {
		String s = "";
		for(int i = 2; i<n;i++)
			if (LaSNT(i))
				s = s + i + "_";
		s = s.substring(0, s.length()-1);
		System.out.printf("Cac SNT < %d la: %s", n, s);
	}
	public static void LietKeSNT_Co5ChuSo(long n) {
		String s = "";
		for(int i = 2; i<n;i++)
			if (LaSNT(i) && DemChuSo(i)==5)
				s = s + i + "_";
		s = s.substring(0, s.length()-1);
		System.out.printf("Cac SNT co 5 chu so la: %s", s);
	}
	public static void LietKeSNT_Co5ChuSo() {
		String s = "";
		for(int i = 10000; i<=99999;i++)
			if (LaSNT(i))
				s = s + i + "_";
		s = s.substring(0, s.length()-1);
		System.out.printf("Cac SNT co 5 chu so la: %s", s);
	}
}
