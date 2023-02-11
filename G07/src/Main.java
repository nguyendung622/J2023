
public class Main {

	public static void main(String[] args) {
		/*
		 * float a = 5, b = 10, c= 2; N203.PTB2(a, b, c); int n = 10; long rs =
		 * N203.GT(n); System.out.printf("\n%d!=%d", n,rs);
		 * 
		 * rs = N203.Fibo(n); System.out.printf("\nFibo(%d) = %d", n,rs);
		 */
		
		float[] a = {1,4,3,5,6,4};
		float b[];
		b = new float[3];
		b[0] = 1;
		b[1] = 5;
		b[2] = 8;
		
		float sA = BTMang.Tong(a);
		float sB = BTMang.Tong(b);
		System.out.printf("\nSA = %f", sA);
		System.out.printf("\nSB = %f", sB);
		
		float[] ks = BTMang.MinMaxAve(a);
		System.out.printf("\nMin = %f, Max = %f, Ave = %f", ks[0], ks[1], ks[2]);
		
		float s = BTMang.TongNguyenTo(a);
		System.out.printf("\nTongNguyenTo = %f", s);
	}
	
}
