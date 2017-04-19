package prob6;

public class RectTriangle extends Shape  {
	private double width;
	private double height;
	
	RectTriangle(double w, double h){
		this.width =w;
		this.height = h;
	}
	
	@Override
	double getArea() {
		return this.width*this.height*0.5;
	}

	@Override
	double getPerimeter() {
		double temp = Math.sqrt((Math.pow(width, 2)+Math.pow(height, 2)));
		return this.width+this.height+temp;
	}


}
