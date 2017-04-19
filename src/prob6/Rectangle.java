package prob6;

public class Rectangle extends Shape implements Resizable{
	private double width;
	private double height;
	
	Rectangle(double w, double h){
		this.width =w;
		this.height = h;
	}
	@Override
	double getArea() {
		return this.height*this.width;
	}

	@Override
	double getPerimeter() {
		return (this.height+this.width)*2;
	}

	@Override
	public void resize(double s) {
		this.width=this.width*s;
		this.height=this.height*s;
	}

}
