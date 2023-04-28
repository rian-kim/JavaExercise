package operator;

public class OperationEx {

	public static void main(String[] args) {
		int mathScore = 90;
		int engScore = 70;
		
		int totalScore = mathScore + engScore;
		System.out.println(totalScore);
		
		double avgScore = totalScore / 2.0;
		System.out.println(avgScore);
		
		int gameScore = 150;
		
		int lastScore1 = gameScore++;
		System.out.println(lastScore1);
		
		int lastScore2 = gameScore--;
		System.out.println(lastScore2);
		
		int num1 = 10;
		int i =2;
		
		boolean value = ((num1 = num1 + 10)<10) && ((i = i+2)<10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value = ((num1 = num1+10)>10) || ((i = i+2)<10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch;
		ch = (fatherAge>motherAge) ? 'T' : 'F';
		System.out.println(ch);
		
		// 1분복습
		int num2=10;
		boolean isEven;
		
		isEven = (num2%2) == 0 ? true : false;
		System.out.println(isEven);
		
		int num3 = 0B00000101;
		
		System.out.println(num3 << 2);
		System.out.println(num3 >> 2);
		System.out.println(num3 >>> 2);
		
		System.out.println(num3);
		
		num3 = num3 << 2;
		System.out.println(num3);
		
		// 연습문제
		
	}

}
