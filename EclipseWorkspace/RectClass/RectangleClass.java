public class RectangleClass{
	private double length;
	private double width;
	public RectangleClass(){
		length = 3;
		width = 5;
	}
		
	public RectangleClass(double NewLength, double NewWidth) {
		if (NewLength <= 0) {
			NewLength = 1;
		}
		if (NewWidth <= 0) {
			NewWidth = 1;
		}
		length = NewLength;
		width = NewWidth;
	}
	
	public double getArea() {
		return length*width;
	}
	public double getPerimeter() {
		return 2*(length*width);
	}
	
	public void setLength(double NewLength) {
		length = NewLength;
	}
	public void setWidth(double NewWidth) {
		width = NewWidth;
	}
	
		
}