package quiz;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeSet;

public class D07_PhoneBook2 {
	
	public static class Info implements Comparable<Info> {
		String name;
		String phoneNumber;
		String address;
		String socialNum;
		int age;
		
		public Info() {}
		
		public Info(String name, int age, String phoneNumber) {
			this.name = name;
			this.age = age;
			this.phoneNumber = phoneNumber;
		}
		
		public String toString() {
			return String.format("%s/%d",name,age);
		}

		//@기본설정 
		public int compareTo(Info o) {
			return name.compareTo(o.name) == 0 ? 
					phoneNumber.compareTo(o.phoneNumber) : name.compareTo(o.name);
		}
	}
	
	HashMap<String, HashMap<String, Info>> phonebook;
	
	public D07_PhoneBook2() {
		phonebook = new HashMap<>();
	}
	
	// 새로운 그룹 추가 (중복제거)
	public boolean addGroup(String groupName) {
		if (phonebook.containsKey(groupName)) {
			System.out.println("이미 존재하는 그룹입니다");
			return false;
		} else {
			phonebook.put(groupName, new HashMap<>());
			System.out.printf("새 그룹 \"%s\"가 추가 되었습니다.\n",groupName);
			return true;
		}
	}
	// 새로운 번호 추가 
	public void addInfo(String groupName,Info info) {
		HashMap<String, Info> group = phonebook.putIfAbsent(groupName, new HashMap<>());
		
		if (group == null) {
			group = phonebook.get(groupName);
		}
		
		group.put(info.phoneNumber, info);
	}
	// 이름의 일부를 입력하면 일치하는 모든 정보가 검색되는 메서드 
	public void searchByName(String name) {
		System.out.println("-- 이름검색 : \"" + name + "\" 의 결과입니다. --");
		for (String groupName : phonebook.keySet()) {
			HashMap<String, Info> group = phonebook.get(groupName);
			
			for (Entry<String, Info> entry : group.entrySet()) {
				if (entry.getValue().name.contains(name)) {
					System.out.println("[" + groupName + "]" + entry.getValue() + "/" + entry.getKey());
				}
			}
		}
	}
	
	// 전화번호의 일부를 입력하면 일치하는 모든 정보가 출력되는 메서드
	public void searchByPhoneNumber(String numberFrag) {
		System.out.println("-- 번호검색 : \"" + numberFrag + "\" 의 결과입니다. --");
		for (String groupName : phonebook.keySet()) {
			HashMap<String, Info> group = phonebook.get(groupName);
			
			for (Entry<String, Info> entry : group.entrySet()) {
				if (entry.getValue().phoneNumber.replace("-","").contains(numberFrag)) {
					System.out.println("[" + groupName + "]" + entry.getValue() + "/" + entry.getKey());
				}
			}
		}
	}
	
	// ( 기본 순서로 출력 )
	public void show() {
		TreeSet<Info> info_set = new TreeSet<>();
		
		for (HashMap<String, Info> group : phonebook.values()) {
			info_set.addAll(group.values());
		}
		System.out.println(info_set);
	}
	public static void main(String[] agrs) {
		D07_PhoneBook2 phone = new D07_PhoneBook2();
		
		phone.addGroup("친구");
		phone.addGroup("가족");
		
		phone.addInfo("학교", new Info("영희",10,"010-1234-1234"));
		phone.addInfo("학교", new Info("민수",20,"010-1111-2222"));
		phone.addInfo("학교", new Info("민수",22,"010-0111-2222"));
		phone.addInfo("가족", new Info("희민",15,"010-3333-4444"));
		phone.addInfo("학교", new Info("정주",16,"010-1233-1122"));
		
		phone.searchByName("희");
		phone.searchByPhoneNumber("12");
		
		phone.show();
	}
}
