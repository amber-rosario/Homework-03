package shapeProcess;

import shapePack.SemiCircle;
import shapePack.Square;

public class ShapeExecute {
	
	public static void main(String[]args) 
	{
		Square square = new Square();
		
		square.printShape();
		square.printSquare();
		square.printRectangle();
		
		System.out.println('\n');		
		
		SemiCircle semiCircle = new SemiCircle();
		
		semiCircle.printShape();
		semiCircle.printSemiCircle();
		semiCircle.printCircle();
	}

}
