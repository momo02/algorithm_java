package day02;

import java.util.Scanner; 
import day02.p01.PrimeNumber;
import day02.p02.ElapsedDays;
import day02.p03.RemainingDays;

public class Start{
	public static void main(String[] args){
		
		System.out.println("실행시킬 문제를 선택하세요");	
		System.out.println("1. 소수 구하기");
		System.out.println("2. 그 해의 경과일 계산하기");
		System.out.println("3. 그 해의 남은일 계산하기");

		Scanner sc = new Scanner(System.in);

		int index = sc.nextInt();
		
		System.out.println("--------------------------------------------");
				
		switch(index){
			case 1 : 
				 	PrimeNumber.process(Integer.parseInt(args[0]));
					break;
			case 2 :
					ElapsedDays.process();
					break;
			case 3 : 
					RemainingDays.process();
					break;
		}
	}
}		

