
public class Main {

	public static void main(String[] args) {
		float a = 5, b = 10, c = 2;
		Basic.PTB2(a, b, c);
		
		int n = 15;
		long rs = Basic.GT(n);
		System.out.printf("%d! = %d\n",n,rs);
		rs = Basic.Fibo(n);
		System.out.printf("Fibo(%d) = %d\n",n,rs);
		
		
	}
}
