package day13.성적관리;

public class ScoreTest {

	public static void main(String[] args) {
		Score s =new Score("홍길동",90,90);
		
		
		s.calResult(); // calresult() 매서드는 객체가 생성된 이후 부터 사용가능
		
		String result =s.toString();
		
		System.out.println(result);
		System.out.println(s);
	}

}
