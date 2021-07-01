package quiz;

public class A10_ConditionQuiz2 {
	
	public static void main(String[] args) {
		
		char a = 'q';
		char b = '\n';
		char c = '2';
		char d = 'D';
		char e = '개';
		char f = 'ぁ';
		String ab = "exit";
		
		System.out.println(a == 'q' || a == 'Q'); //1
		System.out.println(b != '\t' || b != ' '); //2
		System.out.println(c >= '0' && c <= '9'); //3
		System.out.println((d >= 'a' && d <= 'z') || (d >= 'A' && d <= 'Z')); //4
		System.out.println(e >= 44032 && e <= 55203); //5
		System.out.println(f >= 12352 && f <= 12543); //6
		System.out.println(ab.equals("exit")); //7
		
	}
 
}
