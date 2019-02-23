package lab6.src;

import org.junit.Assert;
import org.junit.Test;

/**
 * Lab 6
 *
 * Test class for shapes and their comparators.
 *
 * @author Stephen
 * @version 2019-02-18
 */
public class ShapeTest
{
	//==================================================================================================================
	// Basic Shape Testing:
	//==================================================================================================================
    /**
     * Tests for the square class.
     */
	@Test
	public void SquareTest()
	{
		Shape sqr = new Square("Square1", 3.0);
		Assert.assertEquals("Square area incorrect.", 9.0, sqr.getArea(), 0.0001);
		Assert.assertEquals("Square perimeter incorrect.", 12.0, sqr.getPerimeter(), 0.0001);
		Assert.assertEquals("Square type incorrect.", "Square", sqr.getShapeType());
		Assert.assertEquals("Shape ID incorrect.", "Square1", sqr.getId());
	}

	/**
     * Tests for the rectangle class.
     */
	@Test
	public void RectangleTest()
	{
		Shape rec = new Rectangle("Rectangle1", 3.0, 5.0);
		Assert.assertEquals("Rectangle area incorrect.", 15.0, rec.getArea(), 0.0001);
		Assert.assertEquals("Rectangle perimeter incorrect.", 16.0, rec.getPerimeter(), 0.0001);
		Assert.assertEquals("Rectangle type incorrect.", "Rectangle", rec.getShapeType());
		Assert.assertEquals("Shape ID incorrect.", "Rectangle1", rec.getId());
	}

	/**
     * Tests for the EquilateralTriangle class.
     */
	@Test
	public void TriangleTest()
	{
		Shape eqTri = new EquilateralTriangle("Triangle1", 4.0);
		Assert.assertEquals("Triangle area incorrect.", 4*Math.sqrt(3.0), eqTri.getArea(), 0.0001);
		Assert.assertEquals("Triangle perimeter incorrect.", 12.0, eqTri.getPerimeter(), 0.0001);
		Assert.assertEquals("Triangle type incorrect.", "EquilateralTriangle", eqTri.getShapeType());
		Assert.assertEquals("Shape ID incorrect.", "Triangle1", eqTri.getId());
	}

	/**
     * Tests for the trapezoid class. Also test that IDs are done correctly.
     */
	@Test
	public void TrapezoidTest()
	{
		Shape trap = new Trapezoid("Trapezoid1", 3.0, 3.0, 2.0, 5.0);
		Assert.assertEquals("Trapezoid area incorrect.", 
				(2.0 + 5.0) / 2 * 3.0 * Math.sqrt((1 - Math.pow((Math.pow(5.0 - 2.0, 2) + Math.pow(3.0, 2) - Math.pow(3.0, 2))/(2 * 3.0 * (5.0 - 2.0)), 2))), 
				trap.getArea(), 0.0001);
		Assert.assertEquals("Trapezoid perimeter incorrect.", 13.0, trap.getPerimeter(), 0.0001);
		Assert.assertEquals("Trapezoid type incorrect.", "Trapezoid", trap.getShapeType());
		Assert.assertEquals("Shape ID incorrect.", "Trapezoid1", trap.getId());
	}

	/**
     * Tests for the ellipse class. Also test that IDs are done correctly.
     */
	@Test
	public void EllipseTest()
	{
		Shape circ = new Ellipse("Ellipse1", 3.0, 3.0);
		Assert.assertEquals("Ellipse area incorrect.", Math.PI*3.0*3.0, circ.getArea(),0.0001);
		Assert.assertEquals("Ellipse perimeter incorrect.",
				2 * Math.PI * Math.sqrt((Math.pow(3, 2) + Math.pow(3, 2)) / 2),
				circ.getPerimeter(),0.0001);
		Assert.assertEquals("Ellipse type incorrect.", "Ellipse",circ.getShapeType());
		Assert.assertEquals("Shape ID incorrect.", "Ellipse1", circ.getId());

		Shape circs = new Ellipse("Ellipse2", 5.0, 3.0);
		Assert.assertEquals("Ellipse area incorrect.", Math.PI*3*5, circs.getArea(),0.0001);
		Assert.assertEquals("Ellipse perimeter incorrect.",
				2 * Math.PI * Math.sqrt((Math.pow(5.0, 2) + Math.pow(3.0, 2)) / 2),
				circs.getPerimeter(),0.0001);
		Assert.assertEquals("Ellipse type incorrect.", "Ellipse",circs.getShapeType());
		Assert.assertEquals("Shape ID incorrect.", "Ellipse2", circs.getId());
	}

	/**
     * Tests for the circle class. Also test that IDs are done correctly.
     */
	@Test
	public void CircleTest()
	{
		Shape circ = new Circle("Circle1", 4.0);
		Assert.assertEquals("Circle area incorrect.", Math.PI*4.0*4.0, circ.getArea(),0.0001);
		Assert.assertEquals("Circle perimeter incorrect.", Math.PI*4.0*2.0, circ.getPerimeter(),0.0001);
		Assert.assertEquals("Circle type incorrect.", "Circle",circ.getShapeType());
		Assert.assertEquals("Shape ID incorrect.", "Circle1", circ.getId());
	}

	/**
	 * Tests for Shape's toString().
	 */
	@Test
	public void ShapeToStringTest()
	{
		Shape sqr = new Square("Square2", 4.0);
		Assert.assertEquals("Shape toString incorrect.",
				String.format("%s\t ID = %s\t area = %.3f\t perimeter = %.3f", sqr.getShapeType(), sqr.getId(), sqr.getArea(), sqr.getPerimeter()),
				sqr.toString());
		
		Shape rec = new Rectangle("Rectangle2", 4.0, 5.0);
		Assert.assertEquals("Shape toString incorrect.",
				String.format("%s\t ID = %s\t area = %.3f\t perimeter = %.3f", rec.getShapeType(), rec.getId(), rec.getArea(), rec.getPerimeter()),
				rec.toString());
		
		Shape eqTri = new EquilateralTriangle("Triangle2", 4.0);
		Assert.assertEquals("Shape toString incorrect.",
				String.format("%s\t ID = %s\t area = %.3f\t perimeter = %.3f", eqTri.getShapeType(), eqTri.getId(), eqTri.getArea(), eqTri.getPerimeter()),
				eqTri.toString());
		
		Shape trap = new Trapezoid("Trapezoid2", 4.0, 4.0, 2.0, 5.0);
		Assert.assertEquals("Shape toString incorrect.",
				String.format("%s\t ID = %s\t area = %.3f\t perimeter = %.3f", trap.getShapeType(), trap.getId(), trap.getArea(), trap.getPerimeter()),
				trap.toString());
		
		Shape el = new Ellipse("Ellipse3", 4.0, 5.0);
		Assert.assertEquals("Shape toString incorrect.",
				String.format("%s\t ID = %s\t area = %.3f\t perimeter = %.3f", el.getShapeType(), el.getId(), el.getArea(), el.getPerimeter()),
				el.toString());
		
		Shape circ = new Circle("Circle2", 4.0);
		Assert.assertEquals("Shape toString incorrect.",
				String.format("%s\t ID = %s\t area = %.3f\t perimeter = %.3f", circ.getShapeType(), circ.getId(), circ.getArea(), circ.getPerimeter()),
				circ.toString());
	}

	//==================================================================================================================
	// Comparisons:
	//==================================================================================================================
	/**
     * Tests for the Shape Area Comparator class.
     */
	@Test
	public void CompareAreaTest()
	{
	    // Test equals:
		Shape rect = new Rectangle("R1", 3.0,3.0);
		Shape sqr = new Square("S1", 3.0);
		ShapeAreaComparator sc = new ShapeAreaComparator();
		Assert.assertEquals("ShapeAreaComparator should find shapes equal.", 0, sc.compare(rect, sqr));
		Assert.assertTrue("ShapeAreaComparator should find shapes equal.", sc.equals(rect, sqr));

		// Test equal perimeter, different area:
        Shape rect2 = new Rectangle("R2", 1.0, 9.0);
        Shape sqr2 = new Square("S2", 5.0);
        Assert.assertEquals("ShapeAreaComparator gave incorrect ordering.", -1, sc.compare(rect2, sqr2));
        Assert.assertEquals("ShapeAreaComparator gave incorrect ordering.", 1, sc.compare(sqr2, rect2));
        Assert.assertFalse("ShapeAreaComparator incorrectly finds shapes equal.", sc.equals(rect2, sqr2));

        // Test unequal perimeter and area:
        Assert.assertEquals("ShapeAreaComparator gave incorrect ordering.", 1, sc.compare(sqr2, rect));
        Assert.assertEquals("ShapeAreaComparator gave incorrect ordering.", -1, sc.compare(rect, sqr2));
        Assert.assertFalse("ShapeAreaComparator incorrectly finds shapes equal.", sc.equals(sqr2, rect));
	}

	/**
     * Tests for the Shape Perimeter Comparator class.
     */
	@Test
	public void ComparePerimeterTest()
	{
		// Test equals:
		Shape rect = new Rectangle("R1", 3.0,3.0);
		Shape sqr = new Square("S1", 3.0);
		ShapePerimeterComparator sc = new ShapePerimeterComparator();
		Assert.assertEquals("ShapePerimeterComparator should find shapes equal.", 0, sc.compare(rect, sqr));
		Assert.assertTrue("ShapePerimeterComparator should find shapes equal.", sc.equals(rect, sqr));

		// Test equal area, different perimeter:
        Shape rect2 = new Rectangle("R2", 1.0, 16.0);
        Shape sqr2 = new Square("S2", 4.0);
        Assert.assertEquals("ShapePerimeterComparator gave incorrect ordering.", 1, sc.compare(rect2, sqr2));
        Assert.assertEquals("ShapePerimeterComparator gave incorrect ordering.", -1, sc.compare(sqr2, rect2));
        Assert.assertFalse("ShapePerimeterComparator incorrectly finds shapes equal.", sc.equals(rect2, sqr2));

        // Test unequal perimeter and area:
        Assert.assertEquals("ShapePerimeterComparator gave incorrect ordering.", 1, sc.compare(sqr2, rect));
        Assert.assertEquals("ShapePerimeterComparator gave incorrect ordering.", -1, sc.compare(rect, sqr2));
        Assert.assertFalse("ShapePerimeterComparator incorrectly finds shapes equal.", sc.equals(sqr2, rect));
	}

	/**
	 * Tests the natural ordering of shapes (compareTo in shape)
	 */
	@Test
    public void NaturalCompareTest()
    {
		// Test equals:
		Shape rect = new Rectangle("R1", 3.0, 3.0);
		Shape sqr = new Square("S1", 3.0);
		Assert.assertEquals("Natural comparator should find shapes equal.", 0, rect.compareTo(sqr));
		Assert.assertEquals("Natural comparator should find shapes equal.", 0, sqr.compareTo(rect));

		// Test equal area, different perimeter:
        Shape rect2 = new Rectangle("R2", 1.0, 16.0);
        Shape sqr2 = new Square("S2", 4.0);
        Assert.assertEquals("Natural comparator gave incorrect ordering.", 1, rect2.compareTo(sqr2));
        Assert.assertEquals("Natural comparator gave incorrect ordering.", -1, sqr2.compareTo(rect2));
        Assert.assertFalse("Natural comparator incorrectly finds shapes equal.", rect2.compareTo(sqr2) == 0);

        // Test unequal perimeter and area:
        Assert.assertEquals("Natural comparator gave incorrect ordering.", 1, sqr2.compareTo(rect));
        Assert.assertEquals("Natural comparator gave incorrect ordering.", -1, rect.compareTo(sqr2));
        Assert.assertFalse("Natural comparator incorrectly finds shapes equal.", sqr2.compareTo(rect) == 0);
    }
}
