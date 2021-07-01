import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D09_Regex {
	/*
	  # 정규표현식 
	  
	  - 문자열의 패턴을 표현할 수 있는 표현식 
	  - 특정 프로그래밍 언어에 종속되지 않는 공통의 규칙이다 
	  - 정의한 문자열 패턴과 일치하는 문자열을 걸러낼 수 있다 
	  
	  # Java에서 정규표현식을 다룰 때 사용하는 클래스 
	  
	  - Pattern
	  - Matcher
	 */
	public static void main(String[] args) {
		
		// Pattern.matches(regex, input) : input이 regex에 일치하는지 여부를 검사 
		System.out.println(Pattern.matches("sleep","sleep"));
		
		// [] : 해당 위치의 한 글자에 어떤 문자들이 올 수 있는지 정의하는 표현식 
		System.out.println(Pattern.matches("s[lh@]eep","sleep")); 
		System.out.println(Pattern.matches("s[lh@]eep","sheep")); 
		System.out.println(Pattern.matches("s[lh]eep","s@eep")); 
		System.out.println(Pattern.matches("s[lh@]eep","saeep"));
		System.out.println(Pattern.matches("s[lh@]ee[abcdefghijklmnopqrstruvwyzABCDEFG~~~]","sleep"));
		
		/*
		  [abc] : 해당 자리에 a or b or c 를 허용한다 
		  [^abc] : 해당 자리에 abc를 제외한 모든것을 허용한다   
		  [a-z] : a 부터 z까지 모두 허용한다 
		  [A-Z] : A 부터 Z까지 모두 허용 
		  [\\-] : 문자로서 -를 허용 (Escape) / 그냥 해도 - 만 써도 되지만 , A-Z 가 대문자 전체를 의미하지 않고 A,-,Z 를 표현하고싶을땐 \\- 를 쓴다 
		  [a-e&&c-z] : a-e와 c-z를 모두 만족시키는 문자를 허용 (교집합) 
		  
		  
		  # 하나로 여러 문자를 나타내는 것들 
		  
		  . : 모든 문자
		  \d : 모든 숫자 [0-9]
		  \D : 숫자를 제외한 모든 것 [^0-9]
		  \s : 모든 공백 
		  \S : 공백을 제외한 모든 것 
		  \w : 일반적인 문자들을 허용 [a-zA-Z0-9_]
		  \W : \w을 제외한 모든 것 
		  
		  
		  # 해당 패턴이 적용될 문자의 개수를 정의하는 방법 
		  
		  [a]{n} : {]앞의 패턴이 n개 일치해야 한다 
		  [.]{n,m} : {}앞의 패턴이 최소 n개 최대 m개 일치해야 한다
		  [.]{n,} : {}앞의 패턴이 최소 n개 이상 일치해야 한다 
		  [.]? : ? 앞의 패턴이 0번 또는 한번 나와야 한다  
		  [.]+ : +앞의 패턴이 최소 한번 이상 나와야한다 
		  [.]* : *앞의 패턴이 0번 이상 나와야 한다 
		 */
		System.out.println(Pattern.matches("[.a-zA-Z]{5}", ".Az.."));
		System.out.println(Pattern.matches("[.]{2,5}", ".Az.."));
		System.out.println(Pattern.matches("[.]{2,5}", "."));
		System.out.println(Pattern.matches("[.]{2,5}", "..."));
		System.out.println(Pattern.matches("[.]{2,5}", "..."));
		System.out.println(Pattern.matches("[.]{2,5}", "......"));
		
		System.out.println(Pattern.matches("s?heep", "sheep"));
		System.out.println(Pattern.matches("s?heep", "heep"));
		System.out.println(Pattern.matches("s?heep", "sssheep"));
		System.out.println(Pattern.matches("s?heep", "qheep"));
		

		System.out.println(Pattern.matches("s+heep", "ssssheep"));
		System.out.println(Pattern.matches("s+heep", "heep"));
		
		// 연습문제 : 해당 문자열이 핸드폰 번호인지 검사하는 정규표현식 
		
		System.out.println(Pattern.matches("(010)-(\\d{4})-(\\d{4})", "010-7243-0360"));
		System.out.println(Pattern.matches("010-?\\d{4}-?\\d{4}", "010-7243-0360"));
		
		// 연습문제 : 주민등록번호 정규식 만들기 
		
		System.out.println(Pattern.matches("\\d{2}[01]\\d[0-3]\\d-?[1-4]\\d{6}", "961125-1403111"));
		
		// 연습문제 : 해당 문자열이 이메일인지 검사하는 정규식 
		
		System.out.println(Pattern.matches("\\w+@\\w+(\\.\\w+)?(\\.\\w+)?", "woongbin96@naver.com"));
		
		// # Matcher 사용해서 긴 문자열 검사하기 
		String fruit = "apple/banana/orange/pineapple/greenapple/redapple/mango";
		
		Pattern pattern1 = Pattern.compile("a.{2}le");
		
		// pattern1 로 fruit을 검사한 결과를 반환한다 
		Matcher matcher = pattern1.matcher(fruit);
		
		// matcher.find() : 찾은 것들 중에 다음 것이 존재하면 true
		while (matcher.find()) {
			System.out.println("찾은 것 : " + matcher.group());
			System.out.println("위치 : " + matcher.start() + " 부터 " + matcher.end() + " 까지");
		}
	}
}
