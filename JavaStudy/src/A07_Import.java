import quiz.*;

public class A07_Import {
	
	public static void main(String[] args) {
		
		/*
		 우리가 만들었던 다른 클래스의 기능들을 모두 가져와서 재사용 할 수 있다
		 # import 
		 - 다른 패키지에 정의되어 있는 클래스를 사용하기 위해서는 import가 필요하다  
		 - 해당 패키지의 모든것을 불러오고 싶을 때는 *를 사용한다  
		 - 같은 패키지에 존재하는 클래스들은 import 없이도 사용할 수 있다 
		 */
		// 같은 default 패캐지의 클래스들은 아무런 조치없이 사용할 수 있
		A00_Hello.main(null);
		A01_Escape.main(null);
		A02_Variable.main(null);
		
		A00_PrintRabbit.main(null);
		// 다른 패캐지의 클래스들은 현재 클래스와 다른 패키지에 있음으로 import가 필요하다 
		A01_Memberinfo.main(args);
		A02_introduce.main(args);
	}
	
}
