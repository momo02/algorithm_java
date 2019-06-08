package day02.p03;
import java.util.Scanner;

public class RemainingDays{
	
	public static void process(){

		System.out.println("남은 일을 구할 날짜를 입력 하세요");
		System.out.print("년 : ");
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		System.out.print("월 : ");
		int m = sc.nextInt();
		System.out.print("일 : ");
		int d = sc.nextInt();

		int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
		int remainingDays = 365; 

		if( (y%4 == 0 && y%100 !=0) || y%400 == 0 ){ //윤년 
			remainingDays += 1; 
		}

		int sum = 0;
		for(int i=0; i<m-1; i++){
			sum += months[i];
		}
		System.out.println( (remainingDays - (sum + d)) + "일 남았습니다.");
		
		System.out.println("한 번 더 할까요? (1.예/2.아니오) : ");
		if(1 == sc.nextInt()){
			process();
		}else return;  
	}	
}
