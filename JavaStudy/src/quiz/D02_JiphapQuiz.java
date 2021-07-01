package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D02_JiphapQuiz<T> {
	// T 는 test의 약자로 아무거나 올수 있다 인스턴스가 생겻을 때 그 인스턴스의 타입대로 아래까지 쭈욱 T가 변함 

        static class Fruit {}
        
        static class Apple extends Fruit {}
        static class Banana extends Fruit {}        
        static class Carrot {}
        
        public static void main(String[] args) {
                D02_JiphapQuiz<String> jiphap = new D02_JiphapQuiz<>();        
                
                List<String> A = new ArrayList<>();
                Set<String> B = new HashSet<>();
                
                A.add("Americano");
                A.add("Americano");
                A.add("Cold Brew");
                A.add("Latte");
                
                B.add("Americano");
                B.add("Coke");
                B.add("Sprite");
                
                System.out.println(jiphap.union(A, B));
                System.out.println(jiphap.intersection(A, B));
                System.out.println(jiphap.diff(B, A));
                
                D02_JiphapQuiz<Fruit> jiphap2 = new D02_JiphapQuiz<>();
                
                List<Apple> apple_list = new ArrayList<>();
                Set<Banana> apple_set = new HashSet<>();
                
                jiphap2.union(apple_list, apple_set);
        }
        
        /*
                 1. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 합집합을 Set으로 반환하는 메서드
                 
                   [1, 2, 3, 4] 합집합 [3, 4, 5]  => [1, 2, 3, 4, 5]
                 
                 2. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 교집합을 Set으로 반환하는 메서드
                 
                   [1, 2, 3, 4] 교집합 [3, 4, 5]  => [3, 4]
                 
                 3. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 차집합을 Set으로 반환하는 메서드
                 
                   [1, 2, 3, 4] - [3, 4, 5] => [1, 2]
                 
                   [3, 4, 5] - [1, 2, 3, 4] => [5] 
                 
                 를 만들고 테스트 해보세요
        */
        
        // static을 못쓴다/ t는 인스턴스가 생겼을 때 타입이 정해지고 static은 인스턴스가 없어도 불러올 수 있기 때문에 
        public HashSet<T> union(Collection<? extends T> A, Collection<? extends T> B) {
                HashSet<T> union = new HashSet<>();
                
                union.addAll(A);
                union.addAll(B);
                
                return union;
        }
        
        public HashSet<T> intersection(Collection<? extends T> A, Collection<? extends T> B) {
                HashSet<T> inter = new HashSet<>();
                
                inter.addAll(A);
                inter.retainAll(B);
                
                return inter;
        }
        
        public HashSet<T> diff(Collection<? extends T> A, Collection<? extends T> B) {
                HashSet<T> diff = new HashSet<>();
                
                diff.addAll(A);
                diff.removeAll(B);
                
                return diff;
        }
        
}
