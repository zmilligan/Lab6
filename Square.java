package lab6.src;
/**
 * Lab 6
 * Class representing a square
 * 
 * @author Zandi Milligan
 * @version 2019-02-21
 *
 */
public class Square extends Rectangle
{
	/**
	 * Constructor, references the rectangle constructor
	 * @param id The shape's name identifier, as defined in Shape.java.
	 * @param size The length of the sides of the square
	 */
	public Square(String id, double size)
	{
		super(id, size, size);
	}
	
	/**
	 * Gets the type of the shape.
	 *
	 * @return The string "Square".
	 */
	@Override
	public String getShapeType()
	{
		return "Square";
	}
}
