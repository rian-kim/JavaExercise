package exercise;

public class Sonata extends Car{
	@Override
	public void start() {
		System.out.println("Sonata 시동을 켭니다.");
	}

	@Override
	public void drive() {
		System.out.println("Sonata 달립니다.");		
	}

	@Override
	public void stop() {
		System.out.println("Sonata 멈춥니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Sonata 시동을 끕니다.");
	}
	
	@Override
	public void washCar() {
		System.out.println("세차를 합니다.");
	}

}
