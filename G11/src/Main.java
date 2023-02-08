
public class Main {

	public static void main(String[] args) {

		BTCB.PTB2(3, 10, 5);
		int n = 5;
		long kq = BTCB.GT(n);
		String s = String.format("Giai thua cua %d la %d", n, kq);
		System.out.println(s);

		n = 1234567;
		System.out.println(BTCB.Bai07(n));
		n = 1234;
		System.out.println(BTCB.TongChuSo(n));
	}

}
