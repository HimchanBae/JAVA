package Assignment_Day4;

import java.util.Scanner;

public class Quiz4 
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner (System.in);
		System.out.print("자연수를 입력해 주세요 : ");
		int n = in.nextInt();
		
		for ( int row = 1; row <= n ; row++ ) //행을 만들어 줌
		{
			for ( int column = 1; column <= row; column++ ) //열을 만들어 줌 
			{
				System.out.print("*");
	        }
			System.out.println();
		}
		in.close();
	}

}
