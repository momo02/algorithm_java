package day01;

import day01.p01.ArrayEx01;
import day01.p02.ArrayEx02;

public class Start{
	public static void main(String[] args){
		if(args.length == 0){
			System.out.println("문제 번호를 입력하세요");	
		}else{
			switch(args[0]) {
				case "p01" : 
					ArrayEx01.process();
					break;				
				case "p02" : 
					ArrayEx02.process();
					break;
				default : 
					System.out.println("문제 번호를 확인하세요");
					break;
			}
		}
	}
}		

