package prob3;

public abstract class Bird {
	private String name;

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}
	
	abstract public void fly();
	abstract public void sing();
}
