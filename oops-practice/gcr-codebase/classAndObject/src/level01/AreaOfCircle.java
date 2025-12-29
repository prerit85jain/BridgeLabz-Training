package level01;

class Circle{
	private double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	
	public void areaCircle() {
		System.out.printf("Area of circle: %.5f \n", (Math.PI*Math.pow(radius, 2)));
	}
	
	public void circumferenceCircle() {
		System.out.printf("Circumference of circle: %.3f \n", (2*Math.PI*radius));
	}
}
public class AreaOfCircle {
	public static void main(String[] args) {
		Circle circle1 = new Circle(4);
		circle1.areaCircle();
		circle1.circumferenceCircle();
	}
}
