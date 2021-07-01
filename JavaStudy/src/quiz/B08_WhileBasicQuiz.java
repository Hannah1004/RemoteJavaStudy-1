package quiz;

public class B08_WhileBasicQuiz {
	/*
	 while문을 이용하여 다음을 구하시오
	 1. 1부터 100사이에 있는 3의 배수의 총합
	 2. 355부터 237까지 출력
	 3. continue 를 반드시 사용하여 3000부터 5000사이의 7의 배수만 출력 
	 4. 1부터 200까지의 숫자 중 2의배수도 아니고 3의 배수도 아닌 숫자들의 총합 
	 */
	
	public static void main(String[] args) {
		
		int i = 1;
		int sum = 0;
		
		while(i < 100) {
			if(i % 3 == 0) {
				sum += i;
			}
			++i;
		}
		System.out.println(sum);
		
		
		int z = 355;
		while(z >= 237) {
			System.out.println(z);
			--z;
		}
		
		int y = 2999;
		while(y++ < 5000) {
			if(!(y % 7 == 0)) {
				continue;
			}
			System.out.println(y);
		}
		
		int q = 1;
		int sum2 = 0;
		
		while(q <= 200) {
			if(!((q % 2 == 0) || (q % 3 == 0))) {
				sum2 += q;
			}
			++q;
		}
		System.out.println(sum2);
		
	}

}
