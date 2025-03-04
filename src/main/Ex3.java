package main;

// 예외 처리
public class Ex3 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		try {
			// 에러가 발생할 수 있는 코드
			arr[5] = 5;
		} catch (ArrayIndexOutOfBoundsException e) {
			// 에러가 발생했을 때 처리할 코드
			System.out.println(e);
		}
		
//		arr[5] = 5;
		
		System.out.println("프로그램이 정상적으로 종료가 되었습니다");
		
		// 예외처리를 하면 에러가 발생해도 프로그램이 정상적으로 종료됨
	}

}

// 예외 처리 과정
// 1. 에러가 발생한다
// 2. 에러와 일치하는 catch 블럭을 찾는다
// 3. catch 블록으로 들어가서 코드를 실행한다
// 4. 남은 프로그램을 이어서 실행한다