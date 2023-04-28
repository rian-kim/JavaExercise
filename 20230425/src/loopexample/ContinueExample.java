package loopexample;

public class ContinueExample {

	public static void main(String[] args) {
//		int total = 0;
//		int num;
//		
//		for(num=1;num<=100;num++) {
//			if(num%2==0)
//				continue;
//			total += num;
//		}
//		System.out.println("1부터 100까지의 홀수의 합은: "+ total + "입니다.");
//		
		int sum = 0;
		int num = 0;
		
		for(num = 0; ;num++) {
			sum+= num;
			if(sum>=100)
				break;
		}
		System.out.println("num : "+num);
		System.out.println("sum : "+sum);
		
		// 연습문제1번 p.123
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		
		if(operator=='+') {
			System.out.println(num1+"+"+num2+"="+(num1+num2));
		}else if(operator=='-') {
			System.out.println(num1+"-"+num2+"="+(num1-num2));
		}else if(operator=='*') {
			System.out.println(num1+"*"+num2+"="+(num1*num2));
		}else {
			System.out.println(num1+"/"+num2+"="+(num1/num2));
		}
		
		int result = 0;
		
		switch(operator) {
			case '+' : result = num1+num2;
				break;
			case '-' : result = num1-num2;
				break;
			case '*' : result = num1*num2;
				break;
			case '/' : result = num1/num2;
				break;
			default : System.out.println("연산자 오류입니다");
				return;
		}
		System.out.println("결과값은"+result+"입니다.");
		
		// 연습문제 2번
		int dan;
		int times;
		
		for(dan=2;dan<=9;dan++){
			if(dan%2 !=0) continue;
			for(times=1;times<=9;times++) {
				System.out.println(dan+"*"+times+"="+dan*times);
			}
			System.out.println();
		}
		
		// 연습문제 3번
		for(dan=1;dan<=9;dan++) {
			for(times=1;times<=9;times++) {
				if(times>dan) break;
				System.out.println(dan+"*"+times+"="+dan*times);
			}
			System.out.println();
		}
		
		// 연습문제 4번
		for(int j=1;j<=5;j++) {
			for(int i=1;i<=5-j;i++) {
				System.out.print(" ");
			}
			for(int i=1;i<=2*j-1;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 연습문제 5번
		int lineCount = 9;  
		int spaceCount = lineCount/2 +1;
		int starCount = 1;
		
		for(int i = 0; i<lineCount; i++) {
			for(int j = 0; j<spaceCount; j++) {
				System.out.print(' ');
			}
			for(int j=0; j<starCount; j++) {
				System.out.print('*');
			}
			for(int j = 0; j<spaceCount; j++) {
				System.out.print(' ');
			}
			
			if(i < lineCount/2) {
				spaceCount-=1;
				starCount+=2;
			}
			else {
				spaceCount+=1;
				starCount-=2;
			}
			System.out.println();
		}
		

	}

}
