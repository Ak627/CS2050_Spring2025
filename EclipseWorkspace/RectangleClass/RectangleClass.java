import java.util.*;

public class RectangleClass{
	private double length;
	private double width;
	public SimpleRectangle():
		lenght = 3;
		width = 5;
		
	public SimpleRectangle(double NewLength, double NewWitdh):
		if (NewLength <= 0):
			NewLength = 1;
		if (NewWidth <= 0):
			NewWidth = 1;
		length = NewLength;
		width = NewWidth;
	
	public double getArea():
		return length*width;
	public double getPerimeter():
		return 2*(length*width);
	
	public void setLength(double NewLength):
		length = NewLength;
	public void setWidth(double NewWidth):
		Width = NewWidth;
	
		
}