package myobj.school;

public class NetworkStudent extends Student {
	//리눅스,네트워크,CCNA 점수가 있다 
	
	int ri;
	int net;
	int CCNA;
	
	public NetworkStudent() {
		super();
		ri = generateRandomScore();
		net = generateRandomScore();
		CCNA = generateRandomScore();
	}
	
	int getSum() {
		return (kor + eng + ri + net + CCNA);
	}
	
	double getAverage() {
		return getSum() / 5.0;
	}
	
	@Override
	public void printGradeCard() {
		System.out.println("Network Class");
		System.out.println("***********************************************");
		System.out.println("이름 : " + name + "  총합 : " + getSum() + "점  평균 : " + getAverage() + "점");
		System.out.println("국어\t영어\tRI\tNET\tCCNA");
		System.out.println("-----------------------------------------------");
		System.out.printf("%d\t%d\t%d\t%d\t%d\n",kor,eng,ri,net,CCNA);
		System.out.println("***********************************************");

	}

}
