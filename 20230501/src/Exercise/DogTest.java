package Exercise;

public class DogTest {

	public static void main(String[] args) {
		Dog[] dogArray = new Dog[5];
		dogArray[0] = new Dog("아톰", "슈나우저");
		dogArray[1] = new Dog("뽀삐", "말티즈");
		dogArray[2] = new Dog("봉숙이", "치와와");
		dogArray[3] = new Dog("댕댕", "셰퍼트");
		dogArray[4] = new Dog("초코", "푸들");	
		
		
		for(int i =0; i<dogArray.length; i++) {
			System.out.println(dogArray[i].showDogInfo());
		}
		
		for(Dog dog : dogArray) {
			System.out.println(dog.showDogInfo());
		}

	}

}
