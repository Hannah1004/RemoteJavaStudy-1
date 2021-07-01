package myobj.school;

public class ProgrammingStudent extends Student {
	
	//수학,프로그래밍 언어, 알고리즘, 자료구조 점수가 있다
	int math;
	int pl;
	int al;
	int ds;
	
	public ProgrammingStudent() {
		super();
		math = generateRandomScore();
		pl = generateRandomScore();
		al = generateRandomScore();
		ds = generateRandomScore();
	}
	
	int getSum() {
		return (kor + eng + math + pl + al + ds);
	}
	
	double getAverage() {
		return getSum() / 6.0;
	}

	@Override
	public void printGradeCard() {
		System.out.println("Programming Class");
		System.out.println("***********************************************");
		System.out.println("이름 : " + name + "  총합 : " + getSum() + "점  평균 : " + getAverage() + "점");
		System.out.println("국어\t영어\t수학\tPL\tAL\tDS");
		System.out.println("-----------------------------------------------");
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\n",kor,eng,math,pl,al,ds);
		System.out.println("***********************************************");
	}

}
/*
 printGradeCard 함수를 호출했을때 출력시킬값을 지정한다 / 이름과 과목과 점수 
 ProgrammingStudent constructor 에 (super는 생략가능) 
 점수를 지정해놓지 않았던 다른 과목들도 랜덤으로 점수를 지정할 수 있게 
 이전에 만들어 놓았던 generateRandomScore 클래스를 이용하여 로직생성 
 
 그리고 마지막으로 총합과 평균을 이름 옆에 만든다 
 
 총합은 int형식으로 getSum 클래스를 만들어 각 과목의 점수를 더하고
 평균은 double 형식으로 getAverage 클래스를 만들어 총합에서 과목수만큼 나눠준다 
*/
