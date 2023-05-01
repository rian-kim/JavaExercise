package Exercise;

import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {
		ArrayList<Dog> dog = new ArrayList<Dog>();
		dog.add(new Dog("아톰", "슈나우저"));
		dog.add(new Dog("뽀삐", "말티즈"));
		dog.add(new Dog("봉숙이", "치와와"));
		dog.add(new Dog("댕댕", "셰퍼트"));
		dog.add(new Dog("초코", "푸들"));
		
		for(int i =0; i<dog.size(); i++) {
			System.out.println(dog.get(i).showDogInfo());
		}
		
		for(Dog dog2 : dog) {
			System.out.println(dog2.showDogInfo());
		}

	}

}
