package quiz;

public class Quiz3 {

	public static void main(String[] args) {
		// 예외처리 하기
		Object object = new Integer(0);
		
		if(object instanceof String) { // 타입체크
		
		String str = (String)object; // 다운캐스팅
		
		}
		System.out.println("프로그램이 정상적으로 종료되었습니다");
		
		// object 클래스는 모든 클래스의 부모이므로
		// 모든 인스턴스를 저장할 수 있다
//		try {
//			Object object = new Integer(0); 
//			String str = (String)object; // ClassCastException
//		} catch (Exception e) {
//			System.out.println(e);
//			e.printStackTrace();
//		}
//		System.out.println("프로그램이 정상적으로 종료되었습니다");
		
	}

}
