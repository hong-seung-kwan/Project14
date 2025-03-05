package quiz;

public class Quiz2 {

	public static void main(String[] args) {

//		String str = null;
//		System.out.println(str.length());
	
		

// 		위 코드 실행하면 에러 발생
// 		예외처리 해주기

		try {
			String str = null;
			System.out.println(str.length()); // "str" is null
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("프로그램이 정상적으로 종료되었습니다");
	}
}
