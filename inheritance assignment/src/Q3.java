
class Rectangle{
	int length;
	int breadth;
	
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
		
	}
	
	public int printArea() {
		 return length * breadth;
	}
	
	public int printPerimeter() {
		return 2 *(length + breadth);
	}
}

class Square extends Rectangle{
	int side;
	
	Square(int s){
		super(s,s);
		side = s;
		
	}
}


public class Q3 {

	public static void main(String[] args) {
		
		Rectangle rect = new Rectangle(5, 7);
		System.out.println("Area of rectangle is: "+ 	rect.printArea());
		System.out.println("Perimeter of rectangle: "+ rect.printPerimeter()+ "\n");
		
		Square sq = new Square(5);
		System.out.println("Area of square is: "+ sq.printArea());
		System.out.println("Perimeter of square is: " + sq.printPerimeter());
	}

}
