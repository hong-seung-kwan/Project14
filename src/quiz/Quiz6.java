package quiz;

public class Quiz6 {

	public static void main(String[] args) {
		
		// Book 클래스를 찾을수 없어서 에러남
		
//		Book book = new Book();
		
		
		try {
			Book book = new Book();
		} catch (NoClassDefFoundError e) {
			System.out.println(e);
		}
		System.out.println("프로그램이 정상적으로 종료되었습니다");
	}

}

class Book {
	
}