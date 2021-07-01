import java.util.Random;
import java.util.TreeSet;

public class Cigarette implements Comparable<Cigarette>{
	int tar;
	int nicotine;
	double deathRate;
	String name;
	
	Random ran = new Random();
	
	static String[] lastNameArray = {"MEVIUS-","MALBORO-","HANRASAN-","THIS-","ESSE-","RAISON"
			};

	static String[] firstNameArray = {"read","change","double","blue","black","orange",
			};

	static String generateRandomName() {
		return lastNameArray[(int)(Math.random()*lastNameArray.length)]
				+ firstNameArray[(int)(Math.random()*firstNameArray.length)];
	
	}
	public Cigarette() {
		name = generateRandomName();
		tar = ran.nextInt(20+1);
		nicotine = ran.nextInt(10+1);
		deathRate = (tar + nicotine) * 0.6;
	}

	@Override
	public int compareTo(Cigarette o) {
		return Double.compare(nicotine, o.nicotine) != 0 ?
				Double.compare(deathRate, o.deathRate) : Integer.compare(tar, nicotine);
	}
	
	public String toString() {
		return String.format("%s는 타르가 %dmg이고 니코틴이 %dmg이다 "
				+ "이 담배로 인한 사망률은 %.2f이다\n",name,tar,nicotine,deathRate);
	}
	
	public static void main(String[] args) {
		TreeSet<Cigarette> tarbaco = new TreeSet<>();
		
		for (int i = 0; i < 100; ++i) {
			tarbaco.add(new Cigarette());
		}
		
		Cigarette from = new Cigarette();
		Cigarette to = new Cigarette();
		
		from.deathRate = 5.0;
		to.deathRate = 10.0;
		
		System.out.println(tarbaco.subSet(from, to));
	}
	
}
