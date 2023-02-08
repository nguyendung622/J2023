
public class BTCB {
	/**
	 * Giải phương trình bậc 2
	 * @param a Tham số thứ nhất
	 * @param b Tham số thứ hai
	 * @param c Tham số thứ ba
	 */
	public static void PTB2(float a, float b, float c) {
		double delta = Math.pow(b, 2) - 4 * a *c;
		if (delta < 0) {
			System.out.println("Vo nghiem");
		}
		else if (delta == 0) {
			double x = -b/2*a;
			System.out.println("PT có nghiem kep " + x);
		}
		else {
			double x1 = (-b - Math.sqrt(delta))/2*a;
			double x2 = (-b + Math.sqrt(delta))/2*a;
			System.out.println("Phuong trinh co 2 nghiem: x1 = " + x1 +", x2 = " + x2);
		}
	}
	
	/**
	 * Tính giai thừa (Lặp)
	 * @param n Số cần tính
	 * @return Giai thừa của n
	 */
	public static long GT(int n) {
		long s = 1;
		for(int i = 1;i<=n;i++)
			s *=i;
		return s;
	}
	
	public static long DQGT(int n) {
		if (n == 0)
			return 1;
		else return n * DQGT(n-1);
	}

	public static long Fibo(int n) {
		long F0 = 0, F1 = 1, F2 = 1;
		if (n < 1)
			return 0;
		for(int i = 2;i<=n;i++)
		{
			F2 = F0 + F1;
			F0 = F1;
			F1 = F2;
		}
		return F2;
	}
	public static long UCLN(long a, long b) {
		while (a!=b) {
			if (a > b)
				a = a - b;
			else
				b = b - a;
		}
		return a;
	}
	
	public static long DQ_UCLN(long a, long b) {
		if (a == b)
			return a;
		if (a > b)
			return DQ_UCLN(a - b, b);
		return DQ_UCLN(a, b-a);
	}
	public static long BCNN(long a, long b) {
		long ucln = UCLN(a,b);
		return a * b / ucln;
	}
	
	public static boolean LaSoNguyenTo(int n) {
		if (n <2)
			return false;
		int t = (int)Math.sqrt(n);
		for(int i = 2;i<=t;i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
	public static String LietKeNguyenToNhoHon(int n) {
		String rs = "";
		for(int i = 2; i<n;i++) {
			if (LaSoNguyenTo(i))
				rs += i + "_";
		}
		return rs;
	}
	public static int DemChuSo(long n) {
		int dem = 0;
		while (n !=0) {
			n = n /10;
			dem++;
		}
		return dem;
	}
	public static String Bai07(int n) {
		String rs = "";
		for(int i = 2; i<n;i++) {
			if (LaSoNguyenTo(i) && DemChuSo(i)==5)
				rs += i + "_";
		}
		return rs;
	}

	public static long TongChuSo(long n) {
		long tong = 0;
		while (n !=0) {
			long i = n % 10;
			n = n /10;
			tong = tong + i;
		}
		return tong;
	}
}
