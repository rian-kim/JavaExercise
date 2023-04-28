package classpart;

public class ManTest {

	public static void main(String[] args) {
		Man man = new Man();
		man.age = 40;
		man.name = "James";
		man.ismarried = true;
		man.child = 3;
		
		System.out.println("나이 : "+man.age);
		System.out.println("이름 : "+man.name);
		System.out.println("결혼여부 : "+man.ismarried);
		System.out.println("자녀수 : "+man.child);

	}

}
