package array;

public class BookArray2 {

	public static void main(String[] args) {
		Book[] libarary = new Book[5];
		
		libarary[0] = new Book("태백산맥", "조정래");
		libarary[1] = new Book("데미안", "헤르만 헤세");
		libarary[2] = new Book("어떻게 살 것인가", "유시민");
		libarary[3] = new Book("토지", "박경리");
		libarary[4] = new Book("어린왕자", "생택쥐페리");
		
		for(int i=0;i<libarary.length;i++) {
			libarary[i].showBookInfo();
		}
		for(int i=0;i<libarary.length;i++) {
			System.out.println(libarary[i]);
		}
	}

}
