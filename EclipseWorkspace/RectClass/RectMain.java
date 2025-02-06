public class RectMain{
	public static void main(String [] args) {
		RectangleClass Rectangle1 = new RectangleClass();
		RectangleClass Rectangle2 = new RectangleClass(8,9);
		RectangleClass Rectangle3 = new RectangleClass(-1, 4.2);
		
		System.out.println("Area of Rectangle 1: " + Rectangle1.getArea() + " Perimeter of Rectangle 1: " + Rectangle1.getPerimeter());
		System.out.println("Area of Rectangle 2: " + Rectangle2.getArea() + " Perimeter of Rectangle 2: " + Rectangle2.getPerimeter());
		System.out.println("Area of Rectangle 3: " + Rectangle3.getArea() + " Perimeter of Rectangle 3: " + Rectangle3.getPerimeter());
}
}