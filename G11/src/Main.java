
public class Main {

	public static void main(String[] args) {
		
		Main.PTB2(3,10,5);
		Main m = new Main();
		int n = 5;
		long kq = m.GT(n);
		String s = String.format("Giai thua cua %d la %d",n,kq);
		System.out.println(s);
	}
	
	static void PTB2(float a, float b, float c) {
		double delta = Math.pow(b, 2) - 4 * a *c;
		if (delta < 0) {
			System.out.println("Vo nghiem");
		}
		else if (delta == 0) {
			double x = -b/2*a;
		}
		else {
			double x1 = (-b - Math.sqrt(delta))/2*a;
			double x2 = (-b + Math.sqrt(delta))/2*a;
			System.out.println("Phuong trinh co 2 nghiem: x1 = " + x1 +", x2 = " + x2);
		}
	}
	
	long GT(int n) {
		long s = 1;
		for(int i = 1;i<=n;i++)
			s *=i;
		return s;
	}
	long DQGT(int n) {
		if (n == 0)
			return 1;
		else return n * DQGT(n-1);
	}
}
