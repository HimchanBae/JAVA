package Exam_1;

import java.util.Scanner;
import java.util.Random;

public class Quiz2 
{

	public static void main(String[] args) 
	{
		Random rand = new Random();
		int iValue = rand.nextInt(100) + 1;
		System.out.println("1~100 사이의 숫자를 골랐으니 숫자를 맞춰 보시오.");
		
		int number;
		int count = 1;
		Scanner input = new Scanner ( System.in );
		
		do {
			System.out.print("숫자 입력 > ");
			number = input.nextInt();
			
			if (number < iValue) {
				System.out.println("틀렸습니다, 제가 고른 숫자는 더 큰 수 입니다.");
				count += 1;
			}
			else if (number > iValue) {
				System.out.println("틀렸습니다, 제가 고른 숫자는 더 작은 수 입니다.");
				count += 1;
			}

		} while( number != iValue );
		
		System.out.println("정답입니다!! " + count + " 번 만에 맞추셨습니다. ");
		
		input.close();
	}

}
