package quiz;

import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

public class Quiz7 {

	public static void main(String[] args) {
		
//		Set<Integer> set = new HashSet<Integer>();
//		
//		set.add(1);
//		set.add(2);
//		set.add(3);
//		
//		// Iterator: set을 순회하는 도구
//		// set은 get 사용불가
//		Iterator<Integer> iterator = set.iterator();
//		
//		// next: set에서 다음 요소를 꺼내는 함수
//		int num1 = iterator.next();
//		int num2 = iterator.next();
//		int num3 = iterator.next();
//		int num4 = iterator.next(); // 다음요소가 없어서 에러남
		
		try {
			Set<Integer> set = new HashSet<Integer>();
			
			set.add(1);
			set.add(2);
			set.add(3);
			
			// Iterator: set을 순회하는 도구
			// set은 get 사용불가
			Iterator<Integer> iterator = set.iterator();
			
			// next: set에서 다음 요소를 꺼내는 함수
			int num1 = iterator.next();
			int num2 = iterator.next();
			int num3 = iterator.next();
			int num4 = iterator.next(); // 다음요소가 없어서 에러남
		} catch (NoSuchElementException e) {
			System.out.println(e);
		}
		System.out.println("프로그램이 정상적으로 종료되었습니다");
	}

}
