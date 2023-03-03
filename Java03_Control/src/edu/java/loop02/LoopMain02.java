package edu.java.loop02;

public class LoopMain02 {

	public static void main(String[] args) {
		
		//복합할당 연산자: +=, -=, *=, /=, %=, ...
		int x = 10;
		// x = x+1;
		x += 2; // = ( x = x+1 );
		x *= 3; // = ( x = x * 3);
		x %= 2;
		
		System.out.println("x는 " + x);
		
		int y = 5;
		int z = 11;
		int k = 8;
		
		int result = y+=z*=k+8;
		
		
		System.out.println(result);
		
		// System.out.println : print Line. 출력하고 줄 바꿈
		// System.out.print : 출력하고 줄바꿈이 일어나지 않음. 출력이 끝난 위치에 커서가 위치
		
		System.out.println("test");
		
		System.out.print("test1");
		System.out.print("test2\n");
		
		// 연습문제
		// 0 2 4 6 8 10
		
		// 홀수
		for ( int i = 0; i < 11; i++) {
			if(i%2==1) {
				System.out.print(i);
				System.out.print(" ");
			}
					
			
		}
		System.out.println();
		// 짝수
		for ( int i = 0; i < 11; i++) {
			if(i%2==0) {
				System.out.print(i);
				System.out.print(" ");
			}
		}
		
		System.out.println();
		//짝수 2
		for ( int i = 0; i < 11; i+=2) {
			System.out.print(i);
			System.out.print(" ");
		}
		System.out.println();
		
		//홀수 2
		for ( int i = 1; i < 11; i+=2) {
			System.out.print(i);
			System.out.print(" ");
		}
		
		System.out.println();
		//짝수 3
		for ( int o = 0; o <= 5; o++) {
			System.out.print((2*o)+" ");
			}
		
		System.out.println();
		//홀수 3
		for ( int o = 1; o <= 5; o++) {
			System.out.print((2*o-1)+" ");
			}
		
	}

}
