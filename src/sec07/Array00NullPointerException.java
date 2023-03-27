package sec07;
/**
 * NullPointerException
 * - 메모리에 공간이 안만들어진 상태에서 특정 요소의 값에 접근할 경우 발생
 * - 참조하는 메모리 공간이 없는 상태
 */
public class Array00NullPointerException {

	public static void main(String[] args) {
		int[] intArray = null;
		intArray = new int[3];  //3칸짜리집
		intArray[0] = 10; //NullPointerException
		System.out.println(intArray[0]);
		
		String str = null;
		str = "안녕하세요";
		//NullPointerException
		System.out.println("총 문자 수 : " + str.length());
	}
}
