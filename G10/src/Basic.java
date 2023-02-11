
public class Basic {
	static void PTB2(float a, float b, float c) {
		double delta = Math.pow(b, 2) - 4 * a * c;
		if (delta < 0)
			System.out.println("Vo nghiem");
		else if (delta == 0) {
			double x = -b / 2 * a;
			System.out.println("Co nghiem kep: " + x);
		} else {
			double x1 = (-b - Math.sqrt(delta)) / 2 * a;
			double x2 = (-b + Math.sqrt(delta)) / 2 * a;
			String s = String.format("Nghiem cua PT la: x1= %f, x2=%f", x1, x2);
			System.out.println(s);
		}
	}

	static long GT(long n) {
		long rs = 1;
		for (long i = 1; i <= n; i++)
			rs *= i; // rs = rs * i
		return rs;
	}

	static long GT2(long n) {
		if (n == 0)
			return 1;
		return n * GT2(n - 1);
	}

	static long Fibo(long n) {
		long F0 = 0, F1 = 1, F2 = 1;
		if (n == 0)
			return 0;
		for (long i = 2; i <= n; i++) {
			F2 = F1 + F0;
			F0 = F1;
			F1 = F2;
		}
		return F2;
	}

	static long UCLN(long a, long b) {
		while (a != b) {
			if (a > b)
				a = a - b;
			else
				b = b - a;
		}
		return a;
	}

	static long DQ_UCLN(long a, long b) {
		if (a == b)
			return a;
		else if (a > b)
			return DQ_UCLN(a - b, b);
		return DQ_UCLN(a, b - a);
	}

	static long BCNN(long a, long b) {
		return a * b / UCLN(a, b);
	}

	static boolean LaSNT(long n) {
		if (n < 2)
			return false;
		for (long i = 2; i < n; i++)
			if (n % i == 0)
				return false;
		return true;
	}

	static void Cau5(long n) {
		String s = "";
		for (long i = 2; i < n; i++)
			if (LaSNT(i))
				s = s + i + " ";
		System.out.println(s);
	}

	static void Cau6(long n) {
		String s = "";
		int dem = 0;
		long i = 2;
		while (dem != n) {
			if (LaSNT(i)) {
				s = s + i + " ";
				dem++;
			}
			i++;
		}
		System.out.println(s);
	}

	static long TongCacChuSo(long n) {
		long s = 0;
		while (n != 0) {
			s = s + n % 10;
			n = n / 10;
		}
		return s;
	}

	static long DaoSo(long n) {
		long s = 0;
		while (n != 0) {
			s = s * 10 + n % 10;
			n = n / 10;
		}
		return s;
	}
	static boolean LaSoThuanNghich(long n) {
		return n == DaoSo(n);
	}
}
