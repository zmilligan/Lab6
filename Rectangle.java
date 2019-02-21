package lab6.src;

/**
 * Lab 6
 * Class representing a rectangle
 * 
 * @author Zandi Milligan
 * @version 2019-02-21
 *
 */
public class Rectangle extends Polygon
{
	private double height;
	private double width;
	
	/**
	 * Constructor for the Rectangle class
	 * @param id The identifier for the rectangle
	 * @param height The height of the rectangle
	 * @param width The width of the rectangle
	 */
	public Rectangle(String id, double height, double width)
	{
		super(id);
		this.height = height;
		this.width = width;
	}
	
	/**
	 * Gets the area of the shape
	 * 
	 * @return The area height * width
	 */
	public double getArea()
	{
		return height * width;
	}
	
	/**
	 * Gets the type of the shape.
	 *
	 * @return The string "Rectangle".
	 */
	@Override
	public String getShapeType()
	{
		return "Rectangle";
	}
}
