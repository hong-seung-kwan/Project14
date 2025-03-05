package quiz;

public class Quiz4 {

	public static void main(String[] args) {
		
		// 예외처리 및 코드수정
//		String str = "1.23";
//		int num = Integer.parseInt(str);
		
		
		
		String str = "1.23";
		double num1 = Double.parseDouble(str);
		System.out.println("프로그램이 정상적으로 종료되었습니다");
		
		
		try {
			String str2 = "1.23";
			int num2 = Integer.parseInt(str); // 실수 -> 정수 변환
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("프로그램이 정상적으로 종료되었습니다");
		
	}

}
