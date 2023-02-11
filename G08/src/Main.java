import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		float mang[] = BaiTapCoBan.NhapMang();
		
		float s = BaiTapCoBan.Tong(mang);
		System.out.println("Tong mang1 la: " + s);
		
		float[] mma = BaiTapCoBan.MinMaxAve(mang);
		System.out.printf("Min = %f, Max = %f, Ave = %f", mma[0], mma[1], mma[2]);
 	}
	
}
