package edu.java.loop03;

public class LoopMain03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 구구단 출력
		
		for ( int i = 1; i <= 9 ; i++) {
			System.out.println("2 x " + i + " = " + 2*i);
			//System.out.printf("2 x %d = %d\n", i, (2*i));
			
			// % 뒤쪽자리가 템플릿. 무엇이 들어갈 지 표시.
			// ex. %d => % 뒤에 digit(d) 정수 들어갈 자리
			// System.out.printf(문자열 템플릿/포맷, 템플릿 채울 값);
			// %d => 정수, %f => 실수, %s => 문자열(boolean도 포함)
			// \n 줄바꿈(new line) \t 탭(tab)
	}
		
		
		
		
		// 2. 1-100까지 10개 단위로 정렬 / if문 for문 결합
		for (int i = 1; i <=100 ; i++) {
		if (i%10 == 1){ 
			System.out.println();
		}
		System.out.print(i + "\t"); // \t 탭 키 만큼 공백 만듦.
		
		}
				
		
		//2-1. if문 아예 안쓰고 만들기
			for(int j = 1; j <=10 ; j++) {
				System.out.println();
				
				for(int i = j*10-9; i <=j*10 ; i++) {
					System.out.print(i + "\t");
				}
				
				
			}
		
		
	}
}
