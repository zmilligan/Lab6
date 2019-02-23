package lab6.src;

import org.junit.Assert;
import org.junit.Test;

/**
 * Lab 6
 *
 * Test class for ShapeSorter.
 * Implicitly tests that the comparators are implemented correctly.
 *
 * @author Zandi Milligan
 * @version 2019-02-23
 */
public class ShapeSorterTest
{
	/**
	 * Test that shapes are added correctly.
	 */
	@Test
	public void AddShapeTest()
	{
		ShapeSorter sorter = new ShapeSorter();

		Shape a = new Rectangle("test", 3, 3);
		Shape b = new EquilateralTriangle("test2", 4);
		Shape c = new Square("test3", 3);
		Shape d = new Circle("test4", 1.5);

		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);

		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(0), a);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(1), b);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(2), c);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(3), d);
	}

	/**
	 * Tests sorting via the default ordering.
	 */
	@Test
	public void SortShapesDefaultTest()
	{
		ShapeSorter sorter = new ShapeSorter();

		Shape a = new Rectangle("test", 1, 16);
		Shape b = new EquilateralTriangle("test2", 4);
		Shape c = new Square("test3", 4);
		Shape d = new Circle("test4", 1.5);

		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);
		
		sorter.sortShapes();

		Assert.assertEquals("Shapes sorted incorrectly...", b, sorter.shapes.get(0));
		Assert.assertEquals("Shapes sorted incorrectly...", d, sorter.shapes.get(1));
		Assert.assertEquals("Shapes sorted incorrectly...", c, sorter.shapes.get(2));
		Assert.assertEquals("Shapes sorted incorrectly...", a, sorter.shapes.get(3));
	}

	/**
	 * Tests sorting by area ordering.
	 */
	@Test
	public void SortShapesAreaTest()
	{
		ShapeSorter sorter = new ShapeSorter();

		Shape a = new Rectangle("test", 3, 3);
		Shape b = new EquilateralTriangle("test2", 4);
		Shape c = new Square("test3", 4);
		Shape d = new Circle("test4", 1.5);

		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);
		
		sorter.sortShapes(new ShapeAreaComparator());

		Assert.assertEquals("Shapes sorted incorrectly...", b, sorter.shapes.get(0));
		Assert.assertEquals("Shapes sorted incorrectly...", d, sorter.shapes.get(1));
		Assert.assertEquals("Shapes sorted incorrectly...", a, sorter.shapes.get(2));
		Assert.assertEquals("Shapes sorted incorrectly...", c, sorter.shapes.get(3));
	}

	/**
	 * Tests sorting by perimeter ordering.
	 */
	@Test
	public void SortShapesPerimeterTest()
	{
		ShapeSorter sorter = new ShapeSorter();

		Shape a = new Rectangle("test", 3, 4);
		Shape b = new EquilateralTriangle("test2", 4);
		Shape c = new Square("test3", 4);
		Shape d = new Circle("test4", 1.5);

		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);
		
		sorter.sortShapes(new ShapePerimeterComparator());

		Assert.assertEquals("Shapes sorted incorrectly...", d, sorter.shapes.get(0));
		Assert.assertEquals("Shapes sorted incorrectly...", b, sorter.shapes.get(1));
		Assert.assertEquals("Shapes sorted incorrectly...", a, sorter.shapes.get(2));
		Assert.assertEquals("Shapes sorted incorrectly...", c, sorter.shapes.get(3));
	}

	/**
	 * Tests the toString.
	 */
	@Test
	public void ToStringTest()
	{
		// TODO: complete this...
	}
}
