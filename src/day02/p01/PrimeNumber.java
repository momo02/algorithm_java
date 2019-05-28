package day02.p01;


/**
 * 1초과 1000이하 임의의 수 n을 입력받아 n이하의 소수를 모두 출력하고
 * 소수를 구할때 나눗셈을 수행한 횟수도 같이 출력하는 프로그램을 작성하시오. 
 * */
public class PrimeNumber{
 	public static void process(int num){
		
		int exeCnt = 0;

		for(int i=2; i<=num; i++){
			boolean isPrimeNum = true;

			for(int j=2; j<i; j++){
				exeCnt++;
				if(i % j == 0){
					isPrimeNum = false;
					break;
				}	
			}
				
			if(isPrimeNum){
				System.out.println(i);
			}
		}

		System.out.println("나눗셈을 수행한 횟수 : " + exeCnt);
	}
}



