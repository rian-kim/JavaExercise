package loopexample;

public class BasicLoop {

	public static void main(String[] args) {
//		int num = 1;
//		num += 2;
//		num += 3;
//		num += 4;
//		num += 5;
//		num += 6;
//		num += 7;
//		num += 8;
//		num += 9;
//		num += 10;
//		
//		System.out.println("1부터 10까지의 합은 "+num+"입니다.");
		
//		int num = 1;
//		int sum = 0;
//		
//		while(num <= 10) {
//			sum += num;
//			num++;
//		}
//		System.out.println("1부터 10까지의 합은 "+sum+"입니다.");
//		
//		int num1 = 1;
//		int sum1 = 0;
//		
//		do {
//			sum1 += num1;
//			num1++;
//		}while(num1<=10);
//		
//		System.out.println("1부터 10까지의 합은 "+sum+"입니다.");
		
		int i;
		int sum;
		for(i=1, sum=0;i<=10;i++) {
			sum += i;
		}
		System.out.println("1부터 10까지의 합은 "+sum+"입니다.");
		
		
		for(i=1;i<=10;i++) {
			System.out.println("안녕하세요"+i);
		}
		
		int dan;
		int times;
		
		for(dan=3;dan<=7;dan++) {
			for(times=1;times<=9;times++) {
				System.out.println(dan +"X"+times+"="+dan * times);
			}
			System.out.println();
		}
		

	}

}
