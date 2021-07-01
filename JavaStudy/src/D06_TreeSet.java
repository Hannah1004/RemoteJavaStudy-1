import java.util.TreeSet;

import myobj.student.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

public class D06_TreeSet {
	/*
	  # TreeSet
	  
	  - 순서가 있는 Set (순서가 없는 Set은 HashSet)
	  - 중복은 허용하지 않는다 (Set의 특징)
	  - 데이터를 추가할 때 값을 정렬해서 넣기 때문에 HashSet에 비해 저장 속도가 느리다 (자기 값을 찾아가는 시간이 필요하다)
	  - 미리 정렬이 되어 있기 때문에 정렬된 순서로 값을 꺼내기 편리한 Set이다 
	  - 해당 TreeSet 인스턴스에서 사용할 Comparator를 지정할 수 있다 
	 */
	
	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<>();
		
		numbers.add(10);
		numbers.add(25);
		numbers.add(23);
		numbers.add(11);
		numbers.add(40);
		
		System.out.println(numbers);
		
		// TreeSet에 원하는 Comparator를 사용하기 (정수 내림차순)
		TreeSet<Integer> numbers2 = new TreeSet<>(new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				/*
				  자리를 바꾸고 싶다면 양수리턴 
				  자리를 바꾸기 싫으면 음수리턴
				  두 값이 같은 값이면 0 리턴 
				 */
				return o2 - o1;
			}
		});
		
		numbers2.addAll(numbers);
		
		System.out.println(numbers2);
		
		// * TreeSet은 Set의 일부분을 return 하는데에 특화된 기능이 많다 
		
		// 20보다 작은 값들을 앞에서부터 짤름.
		SortedSet<Integer> head = numbers.headSet(20);
		System.out.println(head);
		
		SortedSet<Integer> tail = numbers.tailSet(11);
		System.out.println(tail);
		
		// 미리 정렬해놓은 방향과 반대 방향인 Set 인스턴스를 반환한다 
		NavigableSet<Integer> desc = numbers.descendingSet();
		System.out.println(desc);
		
		System.out.println("first ? " + numbers.first());
		System.out.println("last ? " + numbers.last());
		System.out.println("pollFirst ?" + numbers.pollFirst());
		System.out.println(numbers);
		System.out.println("pollLast ?" + numbers.pollLast());
		System.out.println(numbers);
		
		System.out.println("subSet(10,30) ? " + numbers.subSet(20,30));
		
		// 순서대로 값이 넣어져있으면  null반환 / 뭔가를 조작했을 때는 그 익명이너클래스를 반환 (다시 갔다 쓸 수 있음)
		System.out.println(numbers.comparator());
		System.out.println(numbers2.comparator());
		
		TreeSet<Integer> numbers3 = new TreeSet<>(numbers2.comparator());
		
		List<Integer> list = new ArrayList<>(numbers);
		Collections.sort(list, numbers2.comparator());
		
		System.out.println("list : " + list);
		
		System.out.println("contains 41? " + numbers2.contains(41));
		System.out.println("contains 41? " + list.contains(25));
		
		System.out.println(numbers);
		
		TreeSet<Integer> num1 = new TreeSet<>();
		num1.add(numbers.pollFirst());
		
		TreeSet<Integer> num2 = new TreeSet<>();
		num2.add(numbers.pollLast());
		
		System.out.println(list.containsAll(numbers));
		System.out.println(list.containsAll(num1));
		System.out.println(list.containsAll(num2));
		
		// 학생 인스턴스를 100개 만들고, 트리셋에 평균 점수 순으로 저장한 후에 평균점수가 50~70 사이인 학생이 모두 몇명인지 세어보세요 
		TreeSet<Student> stu_set = new TreeSet<>();
		
		for (int i = 0; i < 100; ++i) {
			stu_set.add(new Student());
		}
		
		System.out.println(stu_set);
		System.out.println("학생은 총 " + stu_set.size() + "명 입니다");
		
		Student from = new Student();
		Student to = new Student();
		
		from.avg = 20.0;
		to.avg = 70.0;
		
		System.out.println(stu_set.subSet(from, to));
		
		
		
		
	}
}
