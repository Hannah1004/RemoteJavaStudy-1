package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;

import quiz.D07_PhoneBook.Info;

public class D07_PhoneBook {
	/*
	  # HashMap을 이용해 전화번호부를 구현해보세요 
	  
	  1. phonebook에는 그룹 / 전화번호 / 정보를 저장할 수 있다 
	  2. 그룹명을 키값으로 넣으면 해당 그룹의 해당하는 HashMap을 꺼낼 수 있다 
	  3. 꺼낸 HashMap에 전화번호를 넣으면 이름을 꺼낼 수 있다 
	  
	  # 구현해야 할 메서드 
	  
	  1. 새로운 그룹을 추가하는 매서드 
	  2. 그룹에 새로운 전화번호를 등록하는 매서드 
	  3. 등록된 모든 번호를 선택한 항목(Info 필드) 기준으로 오름/내림 차순으로 보여주는 매서드 
	  (아무것도 전달하지 않을 시 기본 순서로 출력 )
	  4. 이름의 일부를 입력하면 일치하는 모든 정보가 검색되는 메서드 
	  5. 전화번호의 일부를 입력하면 일치하는 모든 정보가 출력되는 메서드 
	  
	 */
	
	String group;
	static String[] midPhoneNum = {"1234","2345","6323","6984","2932"};
	static String[] lastPhoneNum = {"7044","0023","0112","7992","2200"};
	static String generateRandomPhoneNum() {
		return "010" +midPhoneNum[(int)(Math.random()*midPhoneNum.length)]
				+ lastPhoneNum[(int)(Math.random()*lastPhoneNum.length)];
	}
	
	static String[] lastNameArray = {"강","고","구","권","김","나","박"};
	static String[] firstNameArray = {"수환","의성","종윤","지수","천혁","소영"};
	static String generateRandomName() {
		return lastNameArray[(int)(Math.random()*lastNameArray.length)]
				+ firstNameArray[(int)(Math.random()*firstNameArray.length)];
	}
	
	public static class Info implements Comparable<Info>{
		int age;
		Random ran = new Random();
		String name;
		
		public Info() {
			name = generateRandomName();
			age = ran.nextInt(50) +20;
		}
		public String toString() {
			return "이름 => " + name + "  나이 => " + age;
		}
		@Override
		public int compareTo(Info o) {
			if (this.age > o.age) {
				return 1;
			} else if (this.age < o.age) {
				return -1;
			} else {
				return this.name.compareTo(o.name);
			}
		}
		
	}
	static HashMap<String, HashMap<String, Info>> phonebook = new HashMap<>();
	
	public D07_PhoneBook(){
		phonebook = new HashMap<>();
	}
	
	public static void main(String[] args) {
		phonebook.put(addGroup(), null);
		phonebook.put(addGroup(), null);
		
		addPhoneNum();
		
		for (HashMap<String, Info> ab : phonebook.values()) {
			for(Entry<String, Info> e : ab.entrySet()) {
				System.out.println(e.getValue());
			}
		}
		Collections.sort(printInformation(phonebook),new 나이정렬하기());
		
	}
	
	// 그룹추가 매서드 
	static String addGroup() {
		Scanner sc = new Scanner(System.in);
		System.out.println("추가할 그룹명을 작성하세요 >");
		String group_name = sc.next();
		
		return group_name;
	}
	// 번호추가 매서드 
	static void addPhoneNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("어떤 그룹에 추가하시겠습니까 ?  >");
		String groupName = sc.next();
		
		HashMap<String, Info> detail = new HashMap<>();
		
		detail.put(generateRandomPhoneNum(),new Info());
		
		phonebook.put(groupName, detail);
		
		for (Entry<String, Info> entry : detail.entrySet()) {
			System.out.print(entry.getKey() + "\t: ");
			System.out.println(entry.getValue());
		}
		
	}
	
	// 정보리스트 
	static List<Info> printInformation(HashMap<String, HashMap<String, Info>>phonebook) {
		for (HashMap<String, Info> ab : phonebook.values()) {
			for(Entry<String, Info> e : ab.entrySet()) {
				List<Info> info_list = new ArrayList<>();
				info_list.add(e.getValue());
				return info_list;
			}
		}
		return null;
	}
	
	// 그룹나타내주기 
	public static String addGroup(HashMap<String, HashMap<String,Info>>phonebook,HashMap<String,Info>newgrup) {
		for (String groupName : phonebook.keySet()) {
			if(newgrup.equals(phonebook.get(groupName))) {
				return groupName;
			}
		}
		return null;
		
	}
	// 이름의 일부를 입력하면 일치하는 모든 정보가 출력되는 매서드 
	public static void searchName(String name) {
		for (HashMap<String, Info> ab : phonebook.values()) {
			for(Entry<String, Info> e : ab.entrySet()) {
				if(e.getValue().name.contains(name)) {
					System.out.println("세부정보 :" + e.getValue());
					System.out.println("핸드폰번호 :" + e.getKey());
					System.out.println(addGroup(phonebook,ab));
				}
			}
		}
	}
	// 전화번호의 일부를 입력하면 일치하는 모든 정보가 출력되는 메서드 
	public static void searchNum(String num) {
		for (HashMap<String, Info> ab : phonebook.values()) {
			for(Entry<String, Info> f : ab.entrySet()) {
				if(f.getKey().contains(num)) {
					System.out.println("핸드폰번호 :" + f.getKey());
					System.out.println("세부정보 :" + f.getValue());
					System.out.println(addGroup(phonebook,ab));
				}
			}
		}
	}
}
class 나이정렬하기 implements Comparator<Info> {
	public int compare(Info o1, Info o2) {
		if (o1.age > o2.age) {
			return 1;
		} else if (o1.age < o2.age) {
			return -1;
		} else {
			return o1.name.compareTo(o2.name);
		}
	}
}
class 이름정렬하기 implements Comparator<Info> {
	public int compare(Info o1, Info o2) {
		if (o1.name.compareTo(o2.name) == 1) {
			return 1;
		} else if (o1.name.compareTo(o2.name) == -1) {
			return -1;
		} else {
			return 0;
		}
	}
	

}

