package loopexample;

public class SwitcchCase {

	public static void main(String[] args) {
		int ranking = 1;
		char medalColor;
		
		switch(ranking) {
			case 1 : medalColor = 'G';
				break;
			case 2 : medalColor = 'S';
				break;
			case 3 : medalColor = 'B';
				break;
			default : medalColor = 'A';				
		}
		System.out.println(ranking + "등 메달의 색깔은" + medalColor + "입니다.");
		
		String medal = "Gold";
		
		switch(medal) {
		case "Gold" :
			System.out.println("금메달입니다.");
			break;
		case "Silver" :
			System.out.println("은메달입니다.");
			break;
		case "Bronze" :
			System.out.println("동메달입니다.");
			break;
		default:
			System.out.println("메달이 없습니다.");
			break;
		}
		
		int floor = 5;
		String name;
		
		switch(floor) {
			case 1 : name = "약국";
				break;
			case 2 : name = "정형외과";
				break;
			case 3 : name = "피부과";
				break;
			case 4 : name = "치과";
				break;
			case 5 : name = "헬스 클럽";
				break;
			default : name = "없음";				
		}
		System.out.println(floor + "층 " + name + "입니다.");
		
		

	}

}
