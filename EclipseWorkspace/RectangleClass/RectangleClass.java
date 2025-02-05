import java.util.*;

public class RectangleClass:
	double length;
	double width;
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
	
	private double getArea():
		return length*width;
	private double getPerimeter():
		return 2*(length*width);
	
	private void setLength(double NewLength):
		length = NewLength;
	private void setWidth(double NewWidth):
		Width = NewWidth;
	
		
	