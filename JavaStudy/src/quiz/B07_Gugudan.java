package quiz;

public class B07_Gugudan {

	public static void main(String[] args) {
		
		for (int dan = 2; dan <= 9; ++dan) {
			System.out.println();
			System.out.print(dan +"단:\t");
			for (int gop = 1; gop <= 9; ++gop) {
				System.out.print(dan + "x" + gop + "=" + dan*gop + "\t");
				
			}
		}
		System.out.println();
		
		for (int dan = 2; dan <= 9; ++dan) {
			System.out.print(dan +"단\t");
		}  
		System.out.println();
		for (int a = 1; a <= 9; ++a) {
			for (int b = 2; b <= 9; ++b) {
				System.out.print(b+"x"+a+"="+a*b + "\t");
			}System.out.println();
		}
		
		
	}
}
	