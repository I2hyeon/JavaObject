package day08;

import java.util.Arrays;

public class StringExample {
	
	public static void main(String[] args) {
		
		// 문자열을 다루는 다양한 방법 
		// 문자열은 사실은 char문자들의 배열이 합쳐진 것
		// index를 가집니다.
		
		// 문자열.메서드명()
		
		String str = "안녕하세요~";
		
		// 문자열 인덱스 번호 자르기
		char c = str.charAt(0);
		System.out.println("0번째 인덱스:" + c);

		// 문자열 길이
		System.out.println("문자열 길이:" + str.length() );
		
		// 문자 찾기
		System.out.println("녕이 있는 위치:" + str.indexOf("녕"));
		System.out.println("흠이 있는 위치:" + str.indexOf("흠")); // 없는 문자라면 -1을 반환
		
		//문자 변경하기
		String r1 = str.replace("안녕", "hello"); // 대상 문자, 변경할 문자
		System.out.println(r1);
		System.out.println(str); // 원본 문자열은 그대로
		
		String str2 = "아 집에 가고 싶다~ㅠㅠ";
		str2 = str2.replace(" ", ""); // 원본 문자열의 공백 삭제
		System.out.println(str2);
		
		str2 = str2.replaceFirst("ㅠ", "ㅛ"); // 첫번째 발견되는 문자열 교체
		System.out.println(str2);
		
		// 문자열 자르기
		System.out.println( str.substring(2) ); // 2번째 문자열 미만까지 절삭(삭제)
		System.out.println( str.subSequence(2, 4)); // 2부터 4미만까지 추출
		
		// 문자열 자르기
		String str3 = "010-1234-5678";
		String[] r3 = str3.split("-");
		String[] r4 = str3.split("");
		char[] r5 = str3.toCharArray();

		System.out.println(Arrays.toString(r3));	
		System.out.println(Arrays.toString(r4));
		System.out.println(Arrays.toString(r5));
		
		// 양측 공백제거
		String str4 = "  hello world   ";
		System.out.println( str4.trim() ); 
		
		// 문자열 비교 
		System.out.println( "홍길동".equals("홍길동") ); // 문자열이 같으면 true
		System.out.println( "홍길동".equals("김길동") ); // 문자열이 다르면 false
		
		// 문자열 대소비교 (앞 문자 아스키 코드 - 뒤 문자 아스키 코드)
		System.out.println( "ABC".compareTo("ABC") ); // 0: 같은 문자
		System.out.println( "ABC".compareTo("ABD") ); // < 0: 뒤의 문자가 사전적으로 뒤에 있음 (더 큼) 
		System.out.println( "ABC".compareTo("ABB") ); // > 0: 앞의 문자가 사전적으로 뒤에 있음 ( 더 큼)
		
		// 문자열 합치기
		System.out.println(String.join("->", "홍", "길", "동"));
		System.out.println(String.join("->", "홍", "길", "동", "입", "니", "다"));
		
	}

}
