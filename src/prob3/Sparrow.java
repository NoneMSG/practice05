package prob3;

public class Sparrow extends Bird {

	@Override
	public void fly() {
		System.out.println("참새("+super.getName()+")가 날아다닙니다.");
	}

	@Override
	public void sing() {
		System.out.println("오리("+super.getName()+")는 소리내어 웁니다.");
	}

	@Override
	public String toString() {
		return "참새의 이름은 "+super.getName()+" 입니다.";
	}
	
}
