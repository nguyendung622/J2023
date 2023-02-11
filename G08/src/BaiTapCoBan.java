import java.util.Scanner;

public class BaiTapCoBan {
	public static void PTB2(float a, float b, float c) {
		double delta = Math.pow(b, 2) - 4 * a * c;
		if (delta < 0)
			System.out.print("PT vo nghiem");
		else if (delta == 0)
			System.out.print("PT co nghiem kep la: " + (-b / 2 * a));
		else {
			double x1 = (-b - Math.sqrt(delta)) / 2 * a;
			double x2 = (-b + Math.sqrt(delta)) / 2 * a;
			String s = String.format("PT co 2 nghiem, x1 = %f, x2 = %f", x1, x2);
			System.out.print(s);
		}

	}

	public static long GT(int n) {
		long s = 1;
		for (int i = 1; i <= n; i++)
			s *= i;
		return s;
	}

	public static long DQGT(int n) {
		if (n == 0)
			return 1;
		return n * DQGT(n - 1);
	}

	public static long Fibo(long n) {
		long F0 = 0, F1 = 1, F2 = 1;
		for (long i = 2; i <= n; i++) {
			F2 = F1 + F0;
			F0 = F1;
			F1 = F2;
		}
		return F2;
	}

	public static long Fibo2(int n) {
		long[] F = new long[n + 1];
		F[0] = 0;
		F[1] = 1;
		for (int i = 2; i <= n; i++)
			F[i] = F[i - 1] + F[i - 2];
		return F[n];
	}

	public static long UCLN(long a, long b) {
		while (a != b) {
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
		return DQ_UCLN(a, b - a);
	}

	public static long BCNN(long a, long b) {
		return a * b / UCLN(a, b);
	}

	public static boolean LaSNT(long n) {
		if (n < 2)
			return false;
		for (long i = 2; i < n; i++)
			if (n % i == 0)
				return false;
		return true;
	}

	public static void LietKeSNT_NhoHon(long n) {
		for (long i = 2; i < n; i++)
			if (LaSNT(i))
				System.out.print(i + " ");
		System.out.println();
	}

	public static void LietKeNSNT(long n) {
		long dem = 0;
		long i = 2;
		while (dem != n) {
			if (LaSNT(i)) {
				System.out.print(i + " ");
				dem++;
			}
			i++;
		}
		System.out.println();
	}

	public static void LietKeSNT5ChuSo() {
		for (long i = 10000; i <= 99999; i++)
			if (LaSNT(i))
				System.out.print(i + " ");
		System.out.println();
	}

	public static float[] NhapMang() {
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap n: ");
		n = scan.nextInt();

		float mang[] = new float[n];
		for (int i = 0; i < n; i++) {
			System.out.printf("Nhap mang[%d]: ", i);
			mang[i] = scan.nextFloat();
		}
		return mang;
	}

	public static float Tong(float[] mang) {
		float s = 0;
		for (int i = 0; i < mang.length; i++)
			s += mang[i];
		return s;
	}

	public static float TongSoNguyenTo(float[] mang) {
		float s = 0;
		for (int i = 0; i < mang.length; i++) {
			int n = (int) mang[i];
			if ((n == mang[i]) && LaSNT(n))
				s += n;
		}
		return s;
	}
	static float Min(float[] mang) {
		float m = Float.MAX_VALUE;
		for(int i=0;i<mang.length;i++)
			if (m > mang[i])
				m = mang[i];
		return m;
	}
	static float Max(float[] mang) {
		float m = Float.MIN_VALUE;
		for(int i=0;i<mang.length;i++)
			if (m < mang[i])
				m = mang[i];
		return m;
	}
	static float Average(float[] mang) {
		float s = Tong(mang);
		return s/mang.length;
	}

	/**
	 * Tìm min, max, average của một mảng
	 * @param mang Một mảng số thực
	 * @return Giá trị min, max, average trong cùng 1 mảng
	 */
	public static float[] MinMaxAve(float[] mang) {
		float[] rs = new float[3];
		rs[0] = Min(mang);
		rs[1] = Max(mang);
		rs[2] = Average(mang);
		return rs;
	}

}
