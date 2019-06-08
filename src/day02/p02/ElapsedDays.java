package day02.p02;

import java.util.Scanner; 

public class ElapsedDays {
		public static void process(){

				System.out.println("경과일을 구할 날짜를 입력 하세요");
				System.out.print("년 : ");
				Scanner sc = new Scanner(System.in);
				int y = sc.nextInt();
				System.out.print("월 : ");
				int m = sc.nextInt();
				System.out.print("일 : ");
				int d = sc.nextInt();

				int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
				
				if(m > 2){	
					if( (y%4 == 0 && y%100 != 0) || y%400 == 0 ){
						months[1] = 29;
					}
				}
				
				int sum = 0; 
				for(int i =0; i<m-1; i++){
						sum += months[i];
				}
				
				System.out.println("그 해 " + (sum + d)  + "째일니다");
		}
}
