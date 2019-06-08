package day02.p01;

/**
 * 1초과 1000이하 임의의 수 n을 입력받아 n이하의 소수를 모두 출력하고
 * 소수를 구할때 나눗셈을 수행한 횟수도 같이 출력하는 프로그램을 작성하시오. 
 * */
public class PrimeNumber{

	public static int[] addArr(int[] a, int b){
		int[] aa = new int[a.length + 1];
		for(int i=0; i<a.length; i++){
			aa[i] = a[i];
		}
		aa[aa.length-1] = b;
		return aa;
	}

 	public static void process(int num){
		
		int exeCnt = 0;
		int[] primeNums = new int[1];
		int idx = 0;
		primeNums[idx] = 2; 

		for(int j=3; j<=num; j+=2){
			boolean isPrimeNum = true;
			for(int primeNum : primeNums){
				exeCnt++;
				if(j % primeNum == 0){
					isPrimeNum = false;
					break;
				}		
			}
			if(isPrimeNum) {
				primeNums = addArr(primeNums, j);
			}
		}	
	
		for(int primeNum : primeNums){
			System.out.println(primeNum);
		}
		
		System.out.println("나눗셈을 수행한 횟수 : " + exeCnt);
	}
}



