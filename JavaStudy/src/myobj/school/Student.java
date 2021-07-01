package myobj.school;

abstract public class Student {
	
	final static int MAX_SCORE = 100;
	
	static String[] lastNameArray = {"강","고","구","권","김","나","박",
							"이","최","남궁","제갈","배","서","현",
							"안","임","유","백","오","신","양","진"};
	
	static String[] firstNameArray = {"수환","의성","종윤","지수","천혁","소영",
							"은철","승모","수빈","승민","수영","덕중","지호",
							"한나","소윤","두식","웅빈","진호"};
	
	static String generateRandomName() {
		return lastNameArray[(int)(Math.random()*lastNameArray.length)]
				+ firstNameArray[(int)(Math.random()*firstNameArray.length)];
	}
	
	static int generateRandomScore() {
		return (int)(Math.random() * (MAX_SCORE + 1));
	};
	
	String name;
	int kor;
	int eng;
	
	public Student() {
		name = generateRandomName();
		kor = generateRandomScore();
		eng = generateRandomScore();
	}
	
	abstract public void printGradeCard();
	
	public String getName() {
		return name;
	}
	
}
/*
 학생의 이름을 배열두개로 랜덤으로 뽑아서 조합하는 형식으로 만들고 이걸 generateRandomName 으로 return한다 
 그리고 다른 페이지에서 상속받아 사용하기 위해 getName()으로 클래스를 만들고 return name;으로 이전에 했던 랜덤네임을 가져온다 
 
 국어와 영어는 모든반에서 동일한 과목이기 때문에 학생클래스에 먼저 넣어둔다 (코드반복을 줄이기 위해서)
 
 점수를 0점부터 100점까지 (기본적으로) 로직을 맞추는데 후에 최고점수가 바뀔 상황을 고려하여 MAX_SCORE를 100으로 넣고
 generateRandomScore에 변수값을 바꿔준다 (원래는 101 이였음)
 
 그리고 성적표를 호출하는 기능은 각 반마다 과목이 다르기때문에 빈값으로 만들어놓는다 
*/