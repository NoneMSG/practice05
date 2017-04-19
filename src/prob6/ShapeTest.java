package prob6;
import java.util.*;
public class ShapeTest {

	public static void main(String[] args) {
		Shape rect = new Rectangle(5,6);
		Shape rectri = new RectTriangle(5,2);
		List<Shape> list = new ArrayList<Shape>();
		list.add(rect);
		list.add(rectri);
		int lSize = list.size(); 
		
		for(int i = 0 ; i < lSize; ++i){
						
			double area = list.get(i).getArea();
			double perimeter = list.get(i).getPerimeter();
			System.out.println("area: "+area);
			System.out.println("perimeter: "+perimeter);
			
			if(list.get(i) instanceof Resizable){
				((Rectangle) list.get(i)).resize(0.5);
				area = list.get(i).getArea();
				perimeter = list.get(i).getPerimeter();
				System.out.println("new area: "+area);
				System.out.println("new perimeter: "+perimeter);
			}
		}
	}

}
